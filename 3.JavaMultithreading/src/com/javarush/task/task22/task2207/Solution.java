package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        ArrayList<String> file = new ArrayList<>(Arrays.asList(String.join(" ",
                Files.readAllLines(Paths.get(new BufferedReader(new InputStreamReader(System.in)).readLine()), StandardCharsets.UTF_8))
                .split("\\s")));

        Iterator<String> it = file.iterator();
        HashSet<String> tempSet = new HashSet<>();

        while (it.hasNext()) {
            String s = it.next();
            it.remove();
            if (!tempSet.contains(s)) {
                String rs = new StringBuilder(s).reverse().toString();
                if (file.contains(rs)) {
                    tempSet.add(rs);
                    Pair pair = new Pair(s, rs);
                    result.add(pair);
                }
            }
        }
        System.out.println(result);
    }


    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
