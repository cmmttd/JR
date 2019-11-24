package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream cur = System.out;
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        PrintStream nStr = new PrintStream(arr);
        System.setOut(nStr);
        testString.printSomething();
        System.setOut(cur);

        //version #1 - does not pass validation
//        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr.toString().split(System.lineSeparator())));
//        al.stream().filter(x -> al.indexOf(x) % 2 != 0).forEach(x -> al.set(al.indexOf(x), x + System.lineSeparator() + "JavaRush - курсы Java онлайн"));
//        al.forEach(System.out::println);

        //version #2
        int count = 1;
        for (String s : arr.toString().split(System.lineSeparator())){
            System.out.println(s);
            if (count++ % 2 == 0) System.out.println("JavaRush - курсы Java онлайн");
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
