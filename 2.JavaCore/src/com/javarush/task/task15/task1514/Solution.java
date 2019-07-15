package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static{
        labels.put(1.0, "abc");
        labels.put(2.0, "sdf");
        labels.put(3.0, "yuio");
        labels.put(4.0, "asd");
        labels.put(5.0, "qwe");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
