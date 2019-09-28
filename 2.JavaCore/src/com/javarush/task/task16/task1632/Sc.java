package com.javarush.task.task16.task1632;

public class Sc extends Thread {
    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
    }
}
