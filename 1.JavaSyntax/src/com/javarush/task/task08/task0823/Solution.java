package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        //make arraylist of words from input, ignoring whitespaces
        List<String> arr = new ArrayList<String>(Arrays.asList(s.split("\\s+")));
        if (arr.get(0).equals("")) arr.remove(0);
        for (int i = 0; i < arr.size(); i++){
            //convert word to char array
            char[] buffer = new char[arr.get(i).length()];
            buffer = arr.get(i).toCharArray();
            buffer[0] = Character.toUpperCase(buffer[0]);
            //valueOf convert char[] to string
            arr.set(i, String.valueOf(buffer));
        }
        for (String run : arr){
            System.out.print(run + " ");
        }
    }
}
