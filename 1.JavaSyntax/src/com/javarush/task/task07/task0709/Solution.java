package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> al = new ArrayList<String>();
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++){
            al.add(i, rd.readLine());
            if (al.get(i).length() < minLen){
                minLen = al.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++){
            if (al.get(i).length() == minLen){
                System.out.println(al.get(i));
            }
        }
    }
}
