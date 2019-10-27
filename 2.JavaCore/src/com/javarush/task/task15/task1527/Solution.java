package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String url = br.readLine();
            String sausages = url.split("\\?")[1];

            ArrayList<String> vars = new ArrayList<>(Arrays.asList(sausages.split("\\&")));
            HashMap<String, String> hm = new HashMap<>();
            StringBuilder sb = new StringBuilder();

            for (String s : vars) {
                String[] temp = s.split("=");
                if (temp.length == 1) hm.put(temp[0], null);
                else if (temp.length == 2) hm.put(temp[0], temp[1]);
                sb.append(temp[0]).append(" ");
            }
            System.out.println(sb.toString().trim());

            if (hm.containsKey("obj")) {
                String objValue = hm.get("obj");
                try {
                    double d = Double.valueOf(objValue);
                    alert(d);
                } catch (Exception e){
                    alert(objValue);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
