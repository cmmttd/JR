package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(br.readLine());
        FileWriter fw = new FileWriter(br.readLine());
        br.close();
        for (int i = 1; fr.ready(); i++) {
            if (i % 2 == 0) fw.write(fr.read());
            else fr.read();
        }
        fr.close();
        fw.close();
    }
}
