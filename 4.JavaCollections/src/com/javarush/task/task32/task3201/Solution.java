package com.javarush.task.task32.task3201;

import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) {
        String file = args[0];
        int position = Integer.parseInt(args[1]);
        String data = args[2];

        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            raf.seek(position >= raf.length() ?
                    raf.length() : position);
            raf.write(data.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
