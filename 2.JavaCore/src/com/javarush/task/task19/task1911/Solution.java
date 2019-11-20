package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream var = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(var);

        System.setOut(stream);
        testString.printSomething();
        System.setOut(console);
        System.out.println(var.toString().toUpperCase());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
