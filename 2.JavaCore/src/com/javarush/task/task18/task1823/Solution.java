package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = br.readLine()) != null && !("exit".equals(input))) {
            new ReadThread(input).start();
        }
        br.close();
    }

    public static class ReadThread extends Thread {
        private String string;

        public ReadThread(String fileName) {
            //implement constructor body
            this.string = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try {
                FileInputStream fis = new FileInputStream(string);
                HashMap<Integer, Integer> repMap = new HashMap<>();

                while (fis.available() > 0) {
                    int b = fis.read();
                    repMap.put(b, repMap.containsKey(b) ? repMap.get(b) + 1 : 1);
                }
                fis.close();
                resultMap.put(string, Collections.max(repMap.entrySet(), Map.Entry.comparingByValue()).getKey());
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("In thread run: " + Thread.currentThread().getName());
            }
        }
    }
}
