package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(consoleReader.readLine()));
        consoleReader.close();
        String content = file.lines().collect(Collectors.joining(System.lineSeparator()));
        file.close();
        //compare list to map
        for (Map.Entry<Integer, String> s : map.entrySet()){
            content = content.replaceAll("\\b" + s.getKey() + "\\b", s.getValue());
        }
        System.out.println(content);
    }
}




















