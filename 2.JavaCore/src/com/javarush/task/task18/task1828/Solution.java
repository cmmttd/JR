package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = br.readLine();

            if (args.length == 4 || "-u".equals(args[0])) {
                BufferedReader fbr = new BufferedReader(new FileReader(fileName));
                ArrayList<String> temp = new ArrayList<>();
                while (true) {
                    String s = fbr.readLine();
                    if (s == null) break;
                    else if ((s.substring(0, 8).trim()).equals(args[1])) temp.add(comb(args[1], args[2], args[3], args[4]));
                    else temp.add(s);
                }
                fbr.close();

                BufferedWriter fbw = new BufferedWriter(new FileWriter(fileName));
                for (String s : temp.stream()
                        .filter(x -> temp.indexOf(x) != temp.size())
                        .map(x -> x + "\n")
                        .collect(Collectors.toList())) {
                    fbw.write(s);
                }
                fbw.close();
            } else if (args.length == 2 || "-d".equals(args[0])) {
                BufferedReader fbr = new BufferedReader(new FileReader(fileName));
                ArrayList<String> temp = new ArrayList<>();
                while (true) {
                    String s = fbr.readLine();
                    if (s == null) break;
                    else if ((s.substring(0, 8).trim()).equals(args[1])) continue;
                    else temp.add(s);
                }
                fbr.close();

                BufferedWriter fbw = new BufferedWriter(new FileWriter(fileName));
                for (String s : temp.stream()
                        .filter(x -> temp.indexOf(x) != temp.size())
                        .map(x -> x + "\n")
                        .collect(Collectors.toList())) {
                    fbw.write(s);
                }
                fbw.close();
            }
        } catch (
                IOException e) {
            System.err.println("IO Error");
            e.printStackTrace();
        }
    }

    private static String comb(String s1, String s2, String s3, String s4){
        StringBuilder res = new StringBuilder(s1);
        while (res.length() < 8) res.append(" ");
        if (res.append(s2).length() > 38) res = new StringBuilder(res.toString().substring(0, 38));
        while (res.length() < 38) res.append(" ");
        if (res.append(s3).length() > 46) res = new StringBuilder(res.toString().substring(0, 46));
        while (res.length() < 46) res.append(" ");
        if (res.append(s4).length() > 50) res = new StringBuilder(res.toString().substring(0, 50));
        while (res.length() < 50) res.append(" ");

        return res.toString();
    }
}
