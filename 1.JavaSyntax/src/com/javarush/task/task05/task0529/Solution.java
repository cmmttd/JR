package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int i = 0, sum = 0;
        while (true) {
            String str = buf.readLine();
            if (str.equals("сумма")) {
                System.out.println(sum);
                return;
            }
            i = Integer.parseInt(str);
            sum += i;
        }
    }
}
