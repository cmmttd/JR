package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fbr = new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter fbw = new BufferedWriter(new FileWriter(br.readLine()));
        br.close();

        //read from file & separate chars
        while (fbr.ready()){
            fbw.write(fbr.readLine().replaceAll("\\p{Punct}", ""));
        }
        fbr.close();
        fbw.close();
    }
}
