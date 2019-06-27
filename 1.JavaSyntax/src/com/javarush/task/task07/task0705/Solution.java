package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] fatherArr = new int[20];
        int[] dautArr = new int[10];
        int[] sonArr = new int[10];
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            fatherArr[i] = Integer.parseInt(rd.readLine());
            if (i < 10){
                dautArr[i] = fatherArr[i];
            }
            else if (i >= 10) {
                sonArr[i - 10] = fatherArr[i];
            }
        }
        for (int i = 0; i < 10; i++){
            System.out.println(sonArr[i]);
        }
    }
}
