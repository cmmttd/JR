package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader file = new BufferedReader(new FileReader(args[0]));

        //read from file and sorting
        TreeMap<String, Double> treeMap = new TreeMap<>();
        file
                .lines()
                .map(x -> x.split(" "))
                .forEach(v -> treeMap.put(v[0], treeMap.containsKey(v[0]) ? treeMap.get(v[0]) + Double.parseDouble(v[1]) : Double.parseDouble(v[1])));
        file.close();

        //out
        treeMap
                .entrySet()
                .stream()
                .map(x -> x.getKey() + " " + x.getValue())
                .forEachOrdered(System.out::println);
    }
}
