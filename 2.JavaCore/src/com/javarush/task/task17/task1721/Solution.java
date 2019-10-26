package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s1 = br.readLine();
            String s2 = br.readLine();
            BufferedReader fr1 = new BufferedReader(new FileReader(s1));
            BufferedReader fr2 = new BufferedReader(new FileReader(s2));

            while (true) {
                String s;
                if ((s = fr1.readLine()) == null) break;
                allLines.add(s);
            }
            while (true) {
                String s;
                if ((s = fr2.readLine()) == null) break;
                forRemoveLines.add(s);
            }

//            System.out.println(allLines);
//            System.out.println(forRemoveLines);
            new Solution().joinData();
//            System.out.println(allLines);
//            System.out.println(forRemoveLines);

            br.close();
            fr1.close();
            fr2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}

























