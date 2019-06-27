package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        return ((anotherCat.strength + anotherCat.age + anotherCat.weight) < (this.strength + this.age + this.weight) ? true : false);
    }

    public static void main(String[] args) {
        Cat trueDD = new Cat();
        Cat GGVP = new Cat();
        trueDD.age = 10;
        trueDD.weight = 13;
        trueDD.strength = 100;
        GGVP.age = 7;
        GGVP.weight = 12;
        GGVP.strength = 50;
        System.out.println(GGVP.fight(trueDD));
    }
}
