package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> inputAl = new ArrayList<Integer>();
        ArrayList<Integer> thr = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            String str = reader.readLine();
            if (str.equals(""))
                return;
            inputAl.add(Integer.parseInt(str));
        }
        for (Integer i: inputAl) {
            if (i % 3 == 0 || i % 2 == 0) {
                if (i % 3 == 0) {
                    thr.add(i);
                }
                if (i % 2 == 0) {
                    even.add(i);
                }
            } else {
                other.add(i);
            }
        }
//        System.out.println("3: " + thr);
//        System.out.println("2: " + even);
//        System.out.println("o: " + other);
        printList(thr);
        printList(even);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
