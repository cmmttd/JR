package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int hund = (number / 100);
        int dec = (number / 10) % 10;
        int rem = (number % 10);
        return hund + dec + rem;
    }
}