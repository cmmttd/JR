package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = reader.readLine();
            if (str.equals("exit")) break;
            else if (str.contains(".")) {
                try {
                    print(Double.parseDouble(str));
                } catch (NumberFormatException e) {
                    print(str);
                }
            } else {
                try {
                    int num = Integer.parseInt(str);
                    if (num > 0 && num < 128) print((short) num);
                    else print(num);
                } catch (NumberFormatException e) {
                    print(str);
                }
            }
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
