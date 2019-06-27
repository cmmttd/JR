package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        int even = 0, odd = 0;
        for (int i = 0; i < 15; i++){
            arr[i] = Integer.parseInt(rd.readLine());
            if (i % 2 == 0){
                even += arr[i];
            }
            else if (i % 2 != 0){
                odd += arr[i];
            }
        }
        if (even < odd){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");

    }
}
