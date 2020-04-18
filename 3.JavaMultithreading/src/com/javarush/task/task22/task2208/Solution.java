package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getQuery(new HashMap<String, String>() {{
            put("name", "Ivanov");
            put("country", "Ukrain");
            put("city", "Kiev");
            put("age", "null");
        }}));
    }

    public static String getQuery(Map<String, String> params) {
        return params.entrySet()
                .stream()
                .filter(fx -> fx.getValue() != null && !fx.getValue().equals("null"))
                .map(mx -> String.format("%s = '%s'", mx.getKey(), mx.getValue()))
                .collect(Collectors.joining(" and "));
    }
}
