package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> mapa = new HashMap<>();
        while (true) {
            String pair = reader.readLine();
            if (pair.equals("")) break;
            int id = Integer.parseInt(pair);
            String name = reader.readLine();
            mapa.put(name, id);
        }
        for (Map.Entry<String, Integer> m : mapa.entrySet()){
            System.out.println(m.getValue() + " " + m.getKey());
        }
    }
}
