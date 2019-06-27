package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        System.out.println(isDateOdd("DECEMBER 31 2004"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat ff = new SimpleDateFormat("MMMM d y", Locale.ENGLISH);
        DateFormat nf = new SimpleDateFormat("D");
        Date res = ff.parse(date);
        int i = Integer.parseInt(nf.format(res));
        return (i % 2 != 0) ? true : false;
    }
}
