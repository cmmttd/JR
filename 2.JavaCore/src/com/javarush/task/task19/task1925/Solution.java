package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader f1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter f2 = new BufferedWriter(new FileWriter(args[1]));

        String s = String.join(",", Arrays.stream(f1.lines().collect(Collectors.joining()).split("\\s+")).filter(x -> x.length() > 6).toArray(String[]::new));
        f1.close();

        f2.write(s);
        f2.close();

    }
}
