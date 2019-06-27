package com.javarush.task.task12.task1227;

/* 
CanFly, CanRun, CanSwim для классов Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanRun, CanSwim, CanFly{
        @Override
        public void fly() {
            System.out.println("utka");
        }

        @Override
        public void run() {
            System.out.println("utka");

        }

        @Override
        public void swim() {
            System.out.println("utka");

        }
    }

    public class Penguin implements CanSwim, CanRun{
        @Override
        public void run() {
            System.out.println("pingui");
        }

        @Override
        public void swim() {
            System.out.println("pingui");

        }
    }

    public class Toad implements CanSwim{
        @Override
        public void swim() {
            System.out.println("swimmer");
        }
    }
}
