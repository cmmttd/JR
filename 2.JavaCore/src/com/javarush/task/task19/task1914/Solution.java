package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream sysOut = System.out;
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        PrintStream temp = new PrintStream(arr);
        System.setOut(temp);
        testString.printSomething();
        System.setOut(sysOut);
        String[] out = arr.toString().split("\\s");
        int frst = Integer.parseInt(out[0]),
                sec = Integer.parseInt(out[2]),
                res = 0;
        switch (out[1]) {
            case ("+"):
                res = frst + sec;
                break;
            case ("-"):
                res = frst - sec;
                break;
            case ("*"):
                res = frst * sec;
                break;
        }
        System.out.println(arr.toString() + res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

