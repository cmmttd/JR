package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
        System.out.println(person.name + " " + person.age);
        person.initialize("11", 9);
        System.out.println(person.name + " " + person.age);
    }

    static class Person {
        //напишите тут ваш код
        String name;
        int age;

        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
