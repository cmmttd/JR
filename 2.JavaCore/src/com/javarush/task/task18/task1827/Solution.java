package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();
        if (args.length == 4 && "-c".equals(args[0])) {
            BufferedReader fbr = new BufferedReader(new FileReader(fileName));
            TreeSet<Integer> treeSet = new TreeSet<>();
            while (true){
                String s = fbr.readLine();
                if (s == null) break;
                treeSet.add(Integer.parseInt(s.substring(0,8).trim()));
            }
            fbr.close();
            String max = String.valueOf(treeSet.stream().mapToInt(x -> x).max().getAsInt() + 1);
            while (max.length() < 8){
                max += " ";
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
            StringBuilder sb = new StringBuilder("\n");
            sb.append(max);
            while (sb.length() < 9){
                sb.append(" ");
            }
            if (sb.append(args[1]).length() > 39) throw new IOException();
            while (sb.length() < 39){
                sb.append(" ");
            }
            if (sb.append(args[2]).length() > 47) throw new IOException();
            while (sb.length() < 47){
                sb.append(" ");
            }
            if (sb.append(args[3]).length() > 51) throw new IOException();
            while (sb.length() < 51){
                sb.append(" ");
            }
            bw.write(sb.toString());
            bw.close();
        }

    }
}





















