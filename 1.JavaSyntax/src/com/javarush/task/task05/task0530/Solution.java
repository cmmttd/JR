package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        String st = reader.readLine();
        int b = Integer.parseInt(st);

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
