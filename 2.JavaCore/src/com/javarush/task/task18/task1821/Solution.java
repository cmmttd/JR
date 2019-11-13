package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        while (fileInputStream.available() > 0){
            Character ch = (char) fileInputStream.read();
            treeMap.put(ch, treeMap.containsKey(ch) ? treeMap.get(ch) + 1 : 1);
        }
        fileInputStream.close();

        treeMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
