package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat vasily = new Cat("Vasily", 13, 7, 100500);
        Cat peach = new Cat("peach", 13, 7, 100500);
        Cat matroskin = new Cat("matroskin", 13, 7, 100500);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}