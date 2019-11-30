package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));

        //fill the map
        TreeMap<String, Double> treeMap = new TreeMap<>();
        file
                .lines()
                .map(x -> x.split(" "))
                .forEach(e -> treeMap.put(e[0], treeMap.containsKey(e[0]) ? treeMap.get(e[0]) + Double.parseDouble(e[1]) : Double.parseDouble(e[1])));
        file.close();

        //find max in map
        Double max = treeMap
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get()
                .getValue();

        treeMap.entrySet().stream().forEachOrdered(e -> {
            if (Double.compare(e.getValue(), max) == 0)
                System.out.println(e.getKey());
        });
    }
}
