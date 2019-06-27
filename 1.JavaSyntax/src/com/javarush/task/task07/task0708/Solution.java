package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int maxLen = 0;
        for (int i = 0; i < 5; i++){
            String buf = rd.readLine();
            strings.add(i, buf);
            if (strings.get(i).length() >= maxLen)
                maxLen = strings.get(i).length();
        }
        for (int i = 0; i < 5; i++){
            if (strings.get(i).length() == maxLen)
                System.out.println(strings.get(i));
        }
    }
}
