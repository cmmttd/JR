package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String name0 = br.readLine();
            String name1 = br.readLine();
            br.close();
            FileInputStream fis = new FileInputStream(name0);
            FileOutputStream fos = new FileOutputStream(name1);
            if (fis.available() > 0) {
                byte[] b = new byte[fis.available()];
                fis.read(b);
                for (int i = b.length - 1; i >= 0; i--) {
                    fos.write(b[i]);
                }
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
