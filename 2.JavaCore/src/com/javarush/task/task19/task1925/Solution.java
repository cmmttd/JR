package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("1,2,3,4,5", "a,b,c,d"));
        ArrayList<String> al2 = al.stream().flatMap(x -> Arrays.asList(x.split(",")).stream()).collect(Collectors.toCollection(ArrayList::new));
        al.forEach(System.out::println);
        System.out.println();
        al.stream().flatMap(x -> Arrays.asList(x.chars()).stream()).mapToInt(Collectors.toCollection(ArrayList::new)).filter(x -> x !+ ',') .forEach(System.out::print);
    }
}
