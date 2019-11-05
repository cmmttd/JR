package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String fileName = br.readLine();

        FileInputStream fis = new FileInputStream(new File(fileName));
        byte min = Byte.MAX_VALUE;
        while (fis.available() != 0){
            byte temp = (byte) fis.read();
            if (temp < min) min = temp;
        }
        br.close();
        fis.close();
        System.out.println(min);
    }
}
