package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fname = br.readLine();
            FileInputStream fis = new FileInputStream(fname);
            int count = 0;
            while (fis.available() > 0){
                if (fis.read() == 44) count++;
            }
            br.close();
            fis.close();
            System.out.println(count);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
