package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat nff = new SimpleDateFormat("MMM dd, y", Locale.ENGLISH);
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Date anvrsry = ff.parse(rd.readLine());
        System.out.println(nff.format(anvrsry).toUpperCase());
    }
}
