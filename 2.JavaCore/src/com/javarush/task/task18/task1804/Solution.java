package com.javarush.task.task18.task1804;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        FileInputStream fis = new FileInputStream(new File(fileName));
        HashMap<Byte, Integer> hm = new HashMap<>();

        while (fis.available() != 0) {
            byte temp = (byte) fis.read();
            hm.put(temp, hm.containsKey(temp) ? hm.get(temp) + 1 : 1);
        }
        br.close();
        fis.close();
        StringBuilder sb = new StringBuilder();
        hm.forEach((k, v) -> {
            if (v == Collections.min(hm.values())) sb.append(k + " ");
        });
        System.out.println(sb.toString().substring(0, sb.length() - 1));
    }
}
