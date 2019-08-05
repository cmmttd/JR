package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader rd = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String str;
            while ((str = rd.readLine()) != null) lines.add(str);
            rd.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
