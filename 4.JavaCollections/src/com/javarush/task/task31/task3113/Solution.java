package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Что внутри папки?
*/
public class Solution {

    private static int countDir = -1; //current directory does not count
    private static int countFiles = 0;
    private static long sizeDir = 0;


    public static void main(String[] args) throws IOException {
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            Path dir = Paths.get(consoleReader.readLine());
            if (!Files.isDirectory(dir)) {
                System.out.println(dir + " - не папка");
            }
            Files.walk(dir)
                    .forEach(x -> {
                        if (Files.isDirectory(x)) countDir++;
                        else if (Files.isRegularFile(x)) {
                            countFiles++;
                            try {
                                sizeDir += Files.size(x);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
            System.out.println("Всего папок - " + countDir);
            System.out.println("Всего файлов - " + countFiles);
            System.out.println("Общий размер - " + sizeDir);
        }
    }
}
