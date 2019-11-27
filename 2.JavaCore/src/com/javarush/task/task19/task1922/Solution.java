package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(consoleReader.readLine()));
        consoleReader.close();

        //read from file through lines()
        ArrayList<String> cx = file.lines().collect(Collectors.toCollection(ArrayList::new));
        file.close();

        //block of pattern create
        String pattern = null;
        for (String s : words) {
            if (pattern == null) pattern = "(" + s + ")";
            else pattern += " || (" + s + ")";
        }
        String finalPattern = pattern;

        cx.stream().filter(x -> {
            Matcher mt = Pattern.compile(finalPattern).matcher(x);
            System.out.println(finalPattern);
            System.out.println(x);
            System.out.println(mt.find());
            return mt.find();
        }).forEach(System.out::println);
    }
}