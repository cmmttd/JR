package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        long position = Integer.parseInt(args[1]);
        String data = args[2];

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw")) {
            randomAccessFile.seek(position);
            byte[] arr = new byte[data.length()];
            randomAccessFile.read(arr, 0, data.length());

            randomAccessFile.seek(randomAccessFile.length());

            if (new String(arr).equals(data)) randomAccessFile.write("true".getBytes());
            else randomAccessFile.write("false".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
