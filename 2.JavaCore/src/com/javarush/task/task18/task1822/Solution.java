package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bis = new BufferedReader(new FileReader(new File(br.readLine())));
        br.close();

        String s;
        while ((s = bis.readLine()) != null) {
            if (s.startsWith(args[0] + " ")) System.out.println(s);
        }
        bis.close();
    }
}
