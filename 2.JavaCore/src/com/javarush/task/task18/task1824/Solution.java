package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = null;
        try {
            while ((s = br.readLine()) != null){
                new FileInputStream(s).close();
            }
        } catch (FileNotFoundException e){
            System.out.println(s);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
