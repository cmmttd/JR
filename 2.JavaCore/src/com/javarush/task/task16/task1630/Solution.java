package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.DuplicateFormatFlagsException;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = rd.readLine();
            secondFileName = rd.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String name;
        private StringBuilder sb = new StringBuilder("");

        @Override
        public void setFileName(String fullFileName) {
            this.name = fullFileName;
        }

        @Override
        public String getFileContent() {
            return this.sb.toString();
        }

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(new FileReader(name));
                for (String s; (s = br.readLine()) != null; ) {
                    sb.append(s).append(" ");
                }
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
