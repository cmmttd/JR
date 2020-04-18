package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String[] file = Files.readAllLines(Paths.get(new BufferedReader(new InputStreamReader(System.in)).readLine()))
                .get(0)
                .split("\\s+");
        StringBuilder result = getLine(file);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (words.length == 0)
            return new StringBuilder();

        StringBuilder res = new StringBuilder(words[0]);
        ArrayList<String> temp = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(words, 1, words.length)));

        //"s" not use
        for (String s : words) {
            Iterator<String> it = temp.iterator();
            while (it.hasNext()) {
                String tempString = it.next();
                if (tempString.substring(0, 1).equalsIgnoreCase((res.substring(res.length() - 1)))) {
                    res.append(" ").append(tempString);
                    it.remove();
                    break;
                }
            }
        }

        if (res.toString().split(" ").length != words.length)
            res.insert(0, getLine(temp.toArray(new String[0])).append(" "));

        return res;
    }
}






