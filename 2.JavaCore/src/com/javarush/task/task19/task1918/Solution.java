package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader htmlFile = new BufferedReader(new FileReader(consoleReader.readLine()));
//        consoleReader.close();
//
//        String content = htmlFile.lines().collect(Collectors.joining("\n"));
//        htmlFile.close();
//
//        System.out.println(content + "\n");
//
//        ArrayList<String> res = new ArrayList<>();
//        while (content.contains("<span") && content.contains("/span>")) {
//            System.out.println(content);
//            String temp = (content.substring(content.indexOf("<span"), content.lastIndexOf("/span>") + 6));
//            System.out.println(temp);
//            res.add(temp);
//            content = temp;
//        }
//
//        System.out.println(res);
        String s = "Info about Leela <span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela" +
                "</span></b></span><span>Super</span><span>girl</span>";
        String tag = "span",
                st = "<" + tag,
                fin = "/" + tag + ">";
        ArrayList<String> al = new ArrayList<>();
        int fo = fin.length();

        if (s.contains(st) && s.contains(fin)) {
            for (String temp = s; temp.contains(st) && temp.contains(fin); temp = temp.substring(1, temp.length() - 1)) {
                temp = temp.substring(temp.indexOf(st), temp.lastIndexOf(fin) + fo);
                System.out.println(temp);
                System.out.println();
                al.add(temp);
            }
        }
        al.forEach(System.out::println);
    }
}


































