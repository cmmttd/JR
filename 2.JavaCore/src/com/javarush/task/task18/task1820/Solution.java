package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        String name2 = br.readLine();

        FileInputStream fis = new FileInputStream(name1);
        StringBuilder firstFile = new StringBuilder();
        while (fis.available() > 0){
            firstFile.append((char)fis.read());
        }
        System.out.println(firstFile);
        fis.close();
        String[] arr = firstFile.toString().split("\\s");
        List<Integer> ali = Arrays.asList(Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray());
    }
}
