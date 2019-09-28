package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Fs());
        threads.add(new Sc());
        threads.add(new Trd());
        threads.add(new Fr());
        threads.add(new Ff());
    }

    public static void main(String[] args) {
    }
}