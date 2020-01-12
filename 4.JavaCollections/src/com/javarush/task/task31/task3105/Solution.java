package com.javarush.task.task31.task3105;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, byte[]> fullContent = new HashMap<>(); //map for data from exist archive

        try (ZipInputStream z = new ZipInputStream(new FileInputStream(args[1]))) {
            for (ZipEntry cur = z.getNextEntry(); cur != null; cur = z.getNextEntry()) {
                if (!Paths.get(cur.toString()).getFileName().toString().equals(Paths.get(args[0]).getFileName().toString())) {
                    //read to byte[]
                    byte[] buf = new byte[1024];
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    int bytes;
                    while ((bytes = z.read(buf)) != -1) {
                        baos.write(buf, 0, bytes);
                    }
                    fullContent.put(cur.toString(), baos.toByteArray());
                }
                z.closeEntry();
            }
        }

        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(args[1]))) {
            for (Map.Entry<String, byte[]> curr : fullContent.entrySet()) {
                zip.putNextEntry(new ZipEntry(curr.getKey()));
                zip.write(curr.getValue());
            }
            zip.putNextEntry(new ZipEntry("new/" + Paths.get(args[0]).getFileName().toString()));
            Files.copy(Paths.get(args[0]), zip);
            //tracing
//            fullContent.put("new/" + Paths.get(args[0]).getFileName().toString(), Files.readAllBytes(Paths.get(args[0])));
//            fullContent.forEach((k, v) -> {
//                System.out.println(k + ":");
//                for (byte b : v) System.out.print((char) b);
//                System.out.println("\n____________________");
//            });
        }
    }
}