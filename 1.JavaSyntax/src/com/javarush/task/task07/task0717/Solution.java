package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            arrayList.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(arrayList);

        // Вывести на экран result
        for (String s: result){
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> al = new ArrayList<String>();
        for (String s: list){
            al.add(s);
            al.add(s);
        }
        return al;
    }
}
