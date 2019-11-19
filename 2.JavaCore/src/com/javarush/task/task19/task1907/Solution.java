package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        while (fr.ready()){
            sb.append((char)fr.read());
        }
        fr.close();
//        #1  validator say something wrong...
        int len = sb.toString().split("\\bworld\\b").length - 1;
        System.out.println(len < 0 ? 0 : len);
    }
}
