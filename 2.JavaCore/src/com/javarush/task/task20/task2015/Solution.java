package com.javarush.task.task20.task2015;

import java.io.*;
import java.time.Clock;

/* 
Переопределение сериализации
*/
public class Solution implements Serializable, Runnable{
    private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        // do something here, doesn't matter what
        while (true) System.out.println(Clock.systemDefaultZone().instant());
    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

    }

    public static void main(String[] args) throws Exception{
        File f = File.createTempFile("temp", "");
        OutputStream os = new FileOutputStream(f);

        Solution s1 =  new Solution(12);


    }
}
