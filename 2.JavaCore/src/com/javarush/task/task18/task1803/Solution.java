package com.javarush.task.task18.task1803;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        FileInputStream fis = new FileInputStream(new File(fileName));
        HashMap<Byte, Integer> ab = new HashMap<>();

        int max = 0;
        while (fis.available() != 0) {
            byte cur = (byte) fis.read();
            if (ab.containsKey(cur)) {
                int temp = ab.get(cur) + 1;
                ab.put(cur, temp);
                max = temp > max ? temp : max;
            } else ab.put(cur, 1);
        }
        br.close();
        fis.close();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Byte, Integer> e : ab.entrySet()){
            if (e.getValue() == max) sb.append(e.getKey() + " ");
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
