package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        int min = Integer.MAX_VALUE;
        for (Integer i : array){
            min = i < min ? i : min;
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int listLen = Integer.parseInt(rd.readLine());
        List<Integer> list = new ArrayList<Integer>();
        while (listLen > 0){
            list.add(Integer.parseInt(rd.readLine()));
            listLen--;
        }
        return list;
    }
}
