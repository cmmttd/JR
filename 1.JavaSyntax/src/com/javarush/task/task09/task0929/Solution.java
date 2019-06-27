package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        InputStream fileInputStream = null;
        OutputStream fileOutputStream = null;

        try {
            fileInputStream = getInputStream(sourceFileName);
            String destinationFileName = reader.readLine();
            fileOutputStream = getOutputStream(destinationFileName);
        } catch (IOException e) {
            System.out.println("Файл не существует.");
            String lastChance = reader.readLine();
            fileInputStream = getInputStream(lastChance);
            String destinationFileName = reader.readLine();
            fileOutputStream = getOutputStream(destinationFileName);
        } finally {
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

