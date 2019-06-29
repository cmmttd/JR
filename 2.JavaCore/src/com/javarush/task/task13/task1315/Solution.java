package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Dog implements Eat, Movable{
        @Override
        public void move() {
            System.out.println("Go&Woof");
        }

        @Override
        public void eat() {
            System.out.println("peak of pyramid");
        }
    }

    public class Cat implements Eat, Edible, Movable{
        @Override
        public void move() {
            System.out.println("Schhhhh");
            System.out.println("run-run-run");
        }

        @Override
        public void beEaten() {
            System.out.println("Alph`s hotcat");
        }

        @Override
        public void eat() {
            System.out.println("Game first");
            System.out.println("Eat second");
        }
    }

    public class Mouse implements Edible, Movable{
        @Override
        public void move() {
            System.out.println("silent run");
        }

        @Override
        public void beEaten() {
            System.out.println("slowest is dead");
        }
    }
}