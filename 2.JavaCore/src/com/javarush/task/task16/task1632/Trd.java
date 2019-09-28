package com.javarush.task.task16.task1632;

public class Trd extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Ура");
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
