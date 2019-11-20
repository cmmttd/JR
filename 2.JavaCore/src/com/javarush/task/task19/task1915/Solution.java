package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();
        PrintStream sysOut = System.out;
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        PrintStream temp = new PrintStream(arr);
        System.setOut(temp);
        testString.printSomething();
        System.setOut(sysOut);
        FileOutputStream fos = new FileOutputStream(fileName);
        for (Character ch : arr.toString().toCharArray()){
            fos.write(ch);
        }
        fos.close();
        System.out.println(arr.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

