package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public Cat(String name){
        this.name = name;
        this.color = "default";
        this.age = 7;
        this.weight = 3;
    }

    public Cat(String name, int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "default";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 7;
        this.color = "default";
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }

    public static void main(String[] args) {

    }
}
