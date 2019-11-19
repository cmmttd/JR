package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fbr = new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter fbw = new BufferedWriter(new FileWriter(br.readLine()));
        br.close();

        //read fro file
        while (fbr.ready()){
            char ch = (char)fbr.read();
            fbw.write(ch == '.' ? '!' : ch);
        }
        fbr.close();
        fbw.close();
    }
}
