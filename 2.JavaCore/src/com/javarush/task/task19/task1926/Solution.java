package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(consoleReader.readLine()));
        consoleReader.close();
        ArrayList<String> al = br.lines().collect(Collectors.toCollection(ArrayList::new));
        br.close();
        al.forEach(x -> System.out.println(new StringBuilder(x).reverse().toString()));
    }
}
