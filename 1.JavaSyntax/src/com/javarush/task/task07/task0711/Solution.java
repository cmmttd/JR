package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            al.add(rd.readLine());
        }
        for (int i = 0; i < 13; i++){
            al.add(0, al.get(4));
            al.remove(5);
        }
        for (int i = 0; i < 5; i++){
            System.out.println(al.get(i));
        }
    }
}
