package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] numArr = new int[10];
        String[] strArr = new String[10];
        for (int i = 0; i < 10; i++){
            strArr[i] = rd.readLine();
            numArr[i] = strArr[i].length();
        }
        for (int i = 0; i < 10; i++){
            System.out.println(numArr[i]);
        }
    }
}
