package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            InputStream inputStream = new FileInputStream(reader.readLine());
            String str = "";

            while (inputStream.available() > 0) {
                str += (char)inputStream.read();

            }
            System.out.println(str);
            reader.close();
            inputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage().toUpperCase());
        }
    }
}