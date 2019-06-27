package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> in = new ArrayList<Integer>();
        try {
            while (true) {
                Integer num = Integer.parseInt(rd.readLine());
                if (num.getClass() == Integer.class) in.add(num);
                else throw new IOException();
            }
        } catch (Exception e) {
            for (Integer integer : in) {
                System.out.println(integer);
            }
        }
    }
}
