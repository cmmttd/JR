package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {

        //#1 not valid solution...
        BufferedReader inp = new BufferedReader(new FileReader(args[0]));
        BufferedWriter out = new BufferedWriter(new FileWriter(args[1]));

        StringBuilder sb = new StringBuilder();
        inp
                .lines()
                .forEach(x -> Stream.of(x.split(" "))
                        .filter(k -> k.matches(".*\\d+.*"))
                        .forEach(j -> sb.append(j).append(" ")));
        inp.close();

        out.write(sb.toString().trim());
        out.close();
    }
}
