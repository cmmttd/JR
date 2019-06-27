package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
        int max = 1, cnt = 1;
        for (int i = 1; i < arrayList.size(); i++){
            if (arrayList.get(i).equals(arrayList.get(i - 1))) cnt++;
            if (cnt > max) max = cnt;
            if (!arrayList.get(i).equals(arrayList.get(i - 1))) cnt = 1;
        }
        System.out.println(max);
    }
}