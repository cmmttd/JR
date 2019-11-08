package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.*;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        String s = args[0];
        FileInputStream fis = new FileInputStream(s);
        int countSpaces = 0,
                countAll = 0;
        while (fis.available() > 0) {
            Character ch = (char)fis.read();
            countAll++;
            if (Character.isSpaceChar(ch)) countSpaces++;
        }
        System.out.println(new DecimalFormat("0.00")
                .format((double)(countSpaces)/countAll*100));
        fis.close();
    }
}
