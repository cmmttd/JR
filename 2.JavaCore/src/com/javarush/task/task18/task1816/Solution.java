package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        String s = args[0];
        FileInputStream fis = new FileInputStream(s);

        int count = 0;
        while (fis.available() > 0){
            int temp = fis.read();
            if (((char)temp >= 'a' && (char)temp <= 'z') || ((char)temp >= 'A' && (char)temp <= 'Z')) count++;
        }
        fis.close();
        System.out.println(count);
    }
}
