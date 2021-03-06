package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String fileName = br.readLine();
        FileInputStream fis = new FileInputStream(new File(fileName));
        byte max = Byte.MIN_VALUE;
        while (fis.available() != 0){
            byte temp = (byte) fis.read();
            if (temp > max) max = temp;
        }
        System.out.println(max);
        br.close();
        fis.close();
    }
}
