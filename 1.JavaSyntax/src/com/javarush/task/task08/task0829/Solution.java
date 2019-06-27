package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> ad = new HashMap<String, String>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String fam = reader.readLine();
            ad.put(city, fam);
        }

        String check = reader.readLine();
        if (ad.containsKey(check)) System.out.println(ad.get(check));

    }
}
