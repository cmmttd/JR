package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(console.readLine()));
        console.close();

        String cont = file.lines().collect(Collectors.joining(""));
        file.close();

        System.out.println(Jsoup.parse(cont, "", Parser.xmlParser()).select(args[0]));
    }
}


































