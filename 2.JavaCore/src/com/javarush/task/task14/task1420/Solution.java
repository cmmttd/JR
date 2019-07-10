package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int fst, sec;
        fst = Integer.parseInt(reader.readLine());
        if (fst <= 0) throw new Exception();
        sec = Integer.parseInt(reader.readLine());
        if (sec <= 0) throw new Exception();

        int min = fst < sec ? fst : sec;
        int max = fst > sec ? fst : sec;
        int eu = max % min;

        while (eu != 0){
            max = min;
            min = eu;
            eu = max % min;
        }
        System.out.println(min);

        reader.close();
    }
}
