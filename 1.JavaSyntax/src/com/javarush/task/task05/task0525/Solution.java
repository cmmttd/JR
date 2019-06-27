package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        //напишите тут ваш код
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c2.toString());
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    //напишите тут ваш код
    public static class Dog{
        public String toString(){
            return "Dog";
        }
    }
    public static class Cat{
        public String toString(){
            return "Cat";
        }
    }
}
