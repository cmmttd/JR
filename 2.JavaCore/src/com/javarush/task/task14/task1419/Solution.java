package com.javarush.task.task14.task1419;

import java.awt.*;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.InterruptedIOException;
import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
            exceptions.add(new SQLClientInfoException());
            exceptions.add(new NullPointerException());
            exceptions.add(new ClassCastException());
            exceptions.add(new ArrayIndexOutOfBoundsException());
            exceptions.add(new StringIndexOutOfBoundsException());
            exceptions.add(new EOFException());
            exceptions.add(new FileNotFoundException());
            exceptions.add(new InterruptedException());
            exceptions.add(new InterruptedIOException());
        }
        //напишите тут ваш код
    }
}
