package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() {
        //implement this method - реализуйте этот метод
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String name = br.readLine();
            br.close();

            InputStream in = new FileInputStream(name);
            load(in);
            in.close();
            System.out.println(properties);
            OutputStream out = new FileOutputStream(name);
            save(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties pr = new Properties();
        pr.putAll(properties);
        pr.store(outputStream, "");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties pr = new Properties();
        pr.load(inputStream);
        pr.forEach((x, y) -> properties.put(String.valueOf(x), String.valueOf(y)));
    }

    public static void main(String[] args) {
        new Thread(() -> new Solution().fillInPropertiesMap()).start();
        System.out.println("hello");
    }
}

















