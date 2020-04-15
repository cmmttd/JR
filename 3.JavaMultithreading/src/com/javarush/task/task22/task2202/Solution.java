package com.javarush.task.task22.task2202;

import java.util.Arrays;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        try {
            String[] temp = string.split(" ");
            if (temp.length < 5)
                throw new TooShortStringException();
            return String.join(" ", Arrays.copyOfRange(temp, 1, 5));
        } catch (NullPointerException e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
