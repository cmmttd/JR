package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

/*
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("White", "Walter");
        map.put("Targarien", "Dynerise");
        map.put("Stone", "Sheron");
        map.put("Smith", "John");
        map.put("Snow", "John");
        map.put("Lenon", "John");
        map.put("Wick", "John");
        map.put("Malkovicah", "John");
        map.put("Malkovich", "John");
        map.put("Gagarin", "Urii");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> e: map.entrySet()) if (e.getValue().equals(name)) count++;
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        if (map.containsKey(lastName)) return 1;
        return 0;

    }

    public static void main(String[] args) {
    }
}
