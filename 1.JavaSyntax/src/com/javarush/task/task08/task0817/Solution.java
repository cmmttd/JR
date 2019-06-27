package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Putin", "Vladimir");
        map.put("Bear", "Dmitry");
        map.put("Lier", "Dmitry");
        map.put("Ivanov", "Ivan");
        map.put("Smirnov", "Ivan");
        map.put("Gorislavovich", "Oleg");
        map.put("Groznyy", "Ivan");
        map.put("Smith", "John");
        map.put("White", "John");
        map.put("Wick", "John");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashSet<String> killList = new HashSet<String>();
        HashMap<String, String> reserv = new HashMap<String, String>(map);
        for (Map.Entry<String, String> e : map.entrySet()) {
            for (Map.Entry<String, String> n : reserv.entrySet()) {
                if (e.getValue().equals(n.getValue()) && !e.getKey().equals(n.getKey())) {
                    killList.add(e.getValue());
                }
            }
        }
        for (String s : killList) {
            removeItemFromMapByValue(map, s);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}
