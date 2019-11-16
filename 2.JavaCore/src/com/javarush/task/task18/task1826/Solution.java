package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[1]);
        FileOutputStream fos = new FileOutputStream(args[2]);
        while (fis.available() > 0){
            fos.write("-e".equals(args[0]) ? fis.read() + 42 : fis.read() - 42);
        }
        fos.close();
        fis.close();
    }

}
