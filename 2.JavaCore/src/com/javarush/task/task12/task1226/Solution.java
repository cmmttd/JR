package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb{
        @Override
        public void climb() {
            System.out.println("climb");
        }

        @Override
        public void run() {
            System.out.println("Tыгыдык");
        }
    }

    public class Dog implements CanRun{
        @Override
        public void run() {
            System.out.println("run");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanFly, CanRun{
        @Override
        public void fly() {
            System.out.println("krya");
        }

        @Override
        public void run() {
            System.out.println("fuckfuckfuck");
        }
    }

    public interface CanFly{
        void fly();
    }

    public interface CanClimb{
        void climb();
    }

    public interface CanRun{
        void run();
    }
}
