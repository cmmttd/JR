package com.javarush.task.task32.task3213;

import java.io.*;
import java.lang.management.BufferPoolMXBean;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) {
        try {
            return new BufferedReader(reader)
                    .lines()
                    .map(row -> row
                            .chars()
                            .map(ch -> ch + key)
                            .mapToObj(cur -> (char) cur)
                            .collect(StringBuilder::new
                                    , StringBuilder::append
                                    , StringBuilder::append))
                    .collect(Collectors.joining(""))
                    ;
        } catch (Exception e) {
            return "";
        }
    }
}
