package com.javarush.task.task18.task1825;

import java.io.*;
import java.sql.Array;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //read file name trough buffer
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //regular - base of file name, max - max index of part
        String input,
                regular = null;
        int max = 0;
        while ((input = br.readLine()) != null && !"end".equals(input)) {
            if (regular == null) regular = input.split("\\.part(\\d+)")[0];
            max = Math.max(max, Integer.parseInt(input.split("\\.part")[1]));
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(regular));
        for (int i = 1; i <= max; i++) {
            BufferedReader bbr = new BufferedReader(new FileReader(regular + ".part" + i));
            for (String s = bbr.readLine(); s != null; s = bbr.readLine()){
                bw.write(s);
            }
            bbr.close();
        }
        bw.close();
    }
}
