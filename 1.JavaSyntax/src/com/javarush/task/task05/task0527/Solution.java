package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

import java.util.function.DoubleFunction;

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Dog angryDog = new Dog("Father", 100, "grey");
        Cat TomCat = new Cat("Tom", 20, 666);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Dog{
        String name;
        int streight;
        String color;

        public Dog(String name, int streight, String color){
            this.name = name;
            this.streight = streight;
            this.color = color;
        }
    }

    public static class Cat{
        String name;
        int speed;
        int death;

        public Cat(String name, int speed, int death){
            this.name = name;
            this.speed = speed;
            this.death = death;
        }
    }
}
