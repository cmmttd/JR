package com.javarush.task.task16.task1632;

public class Fr extends Thread implements Message{
    private boolean isAlive = true;
    @Override
    public void run() {
        while (isAlive){

        }
    }

    @Override
    public void showWarning() {
        isAlive = false;
    }
}
