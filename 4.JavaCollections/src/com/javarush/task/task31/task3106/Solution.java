package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<String> linksStr = Arrays.stream(args)
                .skip(1)
                .collect(Collectors.toCollection(TreeSet::new));
        ArrayList<FileInputStream> links = linksStr.stream()
                .map(x -> {
                    try {
                        return new FileInputStream(x);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    return null;
                })
                .collect(Collectors.toCollection(ArrayList::new));
        SequenceInputStream sis = new SequenceInputStream(Collections.enumeration(links));
        try (ZipInputStream zis = new ZipInputStream(sis); FileOutputStream fos = new FileOutputStream(args[0])) {
            zis.getNextEntry();
            byte[] buf = new byte[1024];
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            for (int bytes = zis.read(buf); bytes != -1; bytes = zis.read(buf)) {
                baos.write(buf, 0, bytes);
            }
            fos.write(baos.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

