package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arr.add(rd.readLine());
        }
        //find min & max
        int min = arr.get(0).length();
        int max = min;
        for (int i = 1; i < 10; i++){
            if (min > arr.get(i).length()){
                min = arr.get(i).length();
            }
            if (max < arr.get(i).length()){
                max = arr.get(i).length();
            }
        }
        //find fist occurence
        for (int i = 0; i < 10; i++){
            if (arr.get(i).length() == min || arr.get(i).length() == max){
                System.out.println(arr.get(i));
                break;
            }
        }

    }
}
