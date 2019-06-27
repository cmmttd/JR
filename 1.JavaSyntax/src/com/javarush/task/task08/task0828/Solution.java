package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String string = rd.readLine();
        ArrayList<String> months = new ArrayList<String>();
        months.addAll(Arrays.asList("null", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        for (int i = 1; i < 13; i++) {
            if (string.equals(months.get(i))){
                System.out.printf("%s is the %d month", string, i);
                break;
            }
        }
    }
}

