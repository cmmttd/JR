package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String SecName;
        private String country;
        private int coints;
        private boolean havePet;
        private String petName;

        //1
        public Human() {
            this.name = "Default";
            this.SecName = "Default";
        }

        //2
        public Human(String name) {
            this.name = name;
            this.SecName = "default";
        }

        //3
        public Human(String name, String SecName) {
            this.name = name;
            this.SecName = SecName;
        }

        //4
        public Human(String name, String SecName, String country) {
            this.name = name;
            this.SecName = SecName;
            this.country = country;
        }

        //5
        public Human(String name, int coints) {
            this.name = name;
            this.SecName = "default";
            this.coints = coints;
        }

        //6
        public Human(String name, String SecName, int coints) {
            this.name = name;
            this.SecName = SecName;
            this.coints = coints;
        }

        //7
        public Human(boolean havePet, String petName, String name){
            this.havePet = havePet;
            this.petName = petName;
            this.name = name;
            this.coints = 0;
        }

        //8
        public Human(String name, String country, boolean havePet){
            this.name = name;
            this.country = country;
            this.havePet = havePet;
            this.coints = 0;
        }

        //9
        public Human(String name, String SecName, String country, String petName){
            this.name = name;
            this.SecName = SecName;
            this.country = country;
            this.petName = petName;
        }

        //10
        public Human(int coints, String country){
            this.coints = coints;
            this.country = country;
        }
    }
}
