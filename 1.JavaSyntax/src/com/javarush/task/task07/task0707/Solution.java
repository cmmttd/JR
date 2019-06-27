package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> al = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            al.add("name " + i);
        }
        System.out.println(al.size());
        for (int i = 0; i < 5; i++){
            System.out.println(al.get(i));
        }
    }
}
