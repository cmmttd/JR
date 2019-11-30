package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception{
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader file = new BufferedReader(new FileReader(console.readLine()));
//        console.close();
        BufferedReader file = new BufferedReader(new FileReader("D:\\Prog\\JR\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1918\\test.html"));

        String cont = file.lines().collect(Collectors.joining(""));
        file.close();

        System.out.println(cont);

        Matcher st = Pattern.compile("<" + args[0]).matcher(cont);
        Matcher fin = Pattern.compile("/" + args[0] + ">").matcher(cont);

        System.out.println(st.results().count());
        System.out.println(fin.results().count());
    }
}


































