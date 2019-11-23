package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        //read files name from console
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(consoleReader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(consoleReader.readLine()));
        consoleReader.close();

        //create array lists from buffered reader through stream()
        ArrayList<String> fstAl = file1.lines().collect(Collectors.toCollection(ArrayList::new));
        file1.close();
        ArrayList<String> secAl = file2.lines().collect(Collectors.toCollection(ArrayList::new));
        file2.close();

        //matching file line by line
        ////if current elems both lists equals -> write SAME to result list
        ////if current elem first list !equals current elem second list and current + 1 elem second list -> write ADDED
        ////else -> REMOVED
        ////when someone bring to end cycle stay on last element
        for (int i = 0, j = 0; i < fstAl.size() && j < secAl.size(); i++, j++) {
            String original = fstAl.get(i);
            String changed = secAl.get(j);
            if (original.equals(changed)) {
                lines.add(new LineItem(Type.SAME, original));
            } else {
                if (j + 1 < secAl.size()) {
                    if (original.equals(secAl.get(j + 1))) {
                        i--;
                        lines.add(new LineItem(Type.ADDED, changed));
                        continue;
                    }
                }
                lines.add(new LineItem(Type.REMOVED, original));
                j--;
            }
            if (j + 1 == secAl.size()) j--;
        }
        if (lines.get(lines.size() - 1).type == Type.SAME){
            if (!fstAl.get(fstAl.size() - 1).equals(secAl.get(secAl.size() - 1))){
                lines.add(new LineItem(Type.ADDED, secAl.get(secAl.size() - 1)));
            }
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
