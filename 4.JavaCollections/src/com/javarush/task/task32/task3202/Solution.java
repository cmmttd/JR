package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) {
        try {
            StringWriter stringWriter = new StringWriter();
            new BufferedReader(new InputStreamReader(is))
                    .lines()
                    .forEach(stringWriter::write);
            return stringWriter;
        } catch (Exception e){
            return new StringWriter();
        }
    }
}