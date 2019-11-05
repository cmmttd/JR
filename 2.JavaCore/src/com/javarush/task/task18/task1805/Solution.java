package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        FileInputStream fis = new FileInputStream(n);
        TreeSet<Byte> tr = new TreeSet<>();

        while (fis.available() != 0) {
            tr.add((byte) fis.read());
        }
        br.close();
        fis.close();
        StringBuilder sb = new StringBuilder();
        tr.forEach(v -> sb.append(v + " "));
        System.out.println(sb.toString().trim());
    }
}
