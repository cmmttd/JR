package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fbr = new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter fbw = new BufferedWriter(new FileWriter(br.readLine()));
        br.close();

        //read from file
        StringBuilder sb = new StringBuilder();
        while (fbr.ready()) sb.append((char)fbr.read());

        //find digits and write to file
        StringBuilder res = new StringBuilder();
        Arrays.stream(sb.toString()
                .split("\\s"))
                .filter(x -> x.matches("\\d+"))
                .forEach(x -> res.append(x + " "));
        for (Character ch : res.toString().trim().toCharArray()){
            fbw.write(ch);
        }
        fbr.close();
        fbw.close();

    }
}
