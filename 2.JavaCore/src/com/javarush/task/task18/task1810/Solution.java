package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String name = br.readLine();
                FileInputStream fis = new FileInputStream(name);
                if (fis.available() < 1000) {
                    fis.close();
                    br.close();
                    throw new DownloadException();
                }
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static class DownloadException extends Exception {

    }
}
