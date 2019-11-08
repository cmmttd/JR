package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String donor = br.readLine();
            String rec1 = br.readLine();
            String rec2 = br.readLine();

            FileInputStream fis = new FileInputStream(donor);
            FileOutputStream fos1 = new FileOutputStream(rec1);
            FileOutputStream fos2 = new FileOutputStream(rec2);

            if (fis.available() > 0) {
                int size = fis.available();
                byte[] b1 = (size % 2 != 0) ? new byte[(size / 2 + 1)] : new byte[(size / 2)];
                byte[] b2 = new byte[(size / 2)];
                fis.read(b1);
                fis.read(b2);
                fos1.write(b1, 0, b1.length);
                fos2.write(b2, 0, b2.length);
            }
            fis.close();
            fos1.close();
            fos2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
