package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream sOut = System.out;
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        PrintStream temp = new PrintStream(arr);
        System.setOut(temp);
        testString.printSomething();
        System.setOut(sOut);
        System.out.println(arr.toString().replaceAll("te", "??"));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
