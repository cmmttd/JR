package com.javarush.task.task13.task1319;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        String fileName;
        String str;
        try {

            fileName = reader.readLine();
            while (true) {
                str = reader.readLine();
                strings.add(str);
                if (str.equals("exit")) break;
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileName)));

            for (String s : strings) {
                bw.write(s + '\n');
            }

            bw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
