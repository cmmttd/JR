package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(br.readLine());
        FileOutputStream fos = new FileOutputStream(br.readLine());

        byte[] content = new byte[fis.available()];
        fis.read(content, 0, fis.available());
        fis.close();

        ArrayList<String> als = new ArrayList<String>(Arrays.asList(new String(content).split("\\s"))) {
            @Override
            public String toString() {
                StringBuilder res = new StringBuilder();
                this.forEach(v -> res.append(Math.round(Double.parseDouble(v))).append(" "));
                return res.toString().trim();
            }
        };

        for (Character ch: als.toString().toCharArray()) {
            fos.write(ch);
        }
        fos.close();
    }

}
