package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ff extends Thread {
    @Override
    public void run() {
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            int res = 0;

            while (true){
                String temp = rd.readLine();
                if ("N".equals(temp)) break;
                res += Integer.parseInt(temp);
            }
            System.out.println(res);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
