package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "windows-1251"));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), StandardCharsets.UTF_8));) {
            for (String s = br.readLine(); s != null; s = br.readLine()) {
                bw.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        not validate
//        Files.write(Paths.get(args[1]), Collections.singleton(Files.lines(Paths.get(args[0]), Charset.forName("windows-1251")).collect(Collectors.joining("\n"))), StandardCharsets.UTF_8);
    }
}
