package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove {
        @Override
        public void eat() {
            System.out.println("im eat");
        }

        @Override
        public void move() {
            System.out.println("im move");
        }
    }

    public class Duck implements CanMove, CanEat, CanFly{
        @Override
        public void fly() {
            System.out.println("fffflyyyyyyy");
        }

        @Override
        public void move() {
            System.out.println("never give up");
        }

        @Override
        public void eat() {
            System.out.println("squack");
        }
    }

    public class Car implements CanMove{
        @Override
        public void move() {
            System.out.println("drrrrr");
        }
    }

    public class Airplane implements CanMove, CanFly{
        @Override
        public void fly() {
            System.out.println("100500$ per sec");
        }

        @Override
        public void move() {
            System.out.println("roll over");
        }
    }
}
