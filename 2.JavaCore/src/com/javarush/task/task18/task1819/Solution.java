package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1 = br.readLine();
        String f2 = br.readLine();

        FileInputStream fis1 = new FileInputStream(f1);
        StringBuilder buffer = new StringBuilder();
        while (fis1.available() > 0){
            buffer.append((char)fis1.read());
        }
        fis1.close();

        FileOutputStream fos = new FileOutputStream(f1);
        FileInputStream fis2 = new FileInputStream(f2);

        while (fis2.available() > 0){
            fos.write(fis2.read());
        }
        fis2.close();

        for (Character ch : buffer.toString().toCharArray()){
            fos.write(ch);
        }
        fos.close();
    }
}
