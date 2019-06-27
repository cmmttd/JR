package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Date;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] res = (ArrayList<String>[])new ArrayList[4];
        for (int k = 0; k < 4; k++) {
            ArrayList<String> buf = new ArrayList<>();
            for (int i = k; i < k + 4; i++) {
                buf.add("Hello" + i);
            }
            res[k] = buf;
        }
        return res;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}