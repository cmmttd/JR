package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> res = new ArrayList<>();

        try {
            String addr = reader.readLine();
            FileInputStream fis = new FileInputStream(addr);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            //parse file line by line
            String s;
            while ((s = br.readLine()) != null){
                res.add(Integer.parseInt(s));
            }
            //sort
            Collections.sort(res);

            //print all even elems from array
            for (Integer i : res){
                if (i % 2 == 0) System.out.println(i);
            }

            fis.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
