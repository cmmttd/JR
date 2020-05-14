package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                //0    1    2    3    4    5
                {'f', 'd', 'e', 'r', 'l', 'k'},//0
                {'u', 's', 'a', 'm', 'e', 'o'},//1
                {'l', 'n', 'g', 'r', 'o', 'v'},//2
                {'m', 'l', 'p', 'r', 'r', 'h'},//3
                {'p', 'o', 'e', 'e', 'j', 'j'} //4
        };
//        System.out.println(detectAllWords(crossword, "home", "same"));
        System.out.println(detectAllWords(crossword, "poe"));
        /*
        Ожидаемый результат
        home - (5, 3) - (2, 0)
        same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        int rowsNumber = crossword.length;
        int columnNumber = crossword[0].length;

        for (int[] arr : crossword)
            if (arr.length != columnNumber)
                throw new IllegalArgumentException("Defective crossword array");

        String patternString = words[0].charAt(0) + ".*{" + columnNumber + "}" + words[0].charAt(1) + ".*{" + columnNumber + "}" + words[0].charAt(2);
        System.out.println(patternString);


        HashSet<String> wordsSet = Arrays.stream(words).collect(Collectors.toCollection(HashSet::new));
        ArrayList<Word> res = new ArrayList<>();

        String baseString = Arrays
                .stream(crossword)
                .map(x -> Arrays
                        .stream(x)
                        .mapToObj(y -> String.valueOf((char) y))
                        .collect(Collectors.joining()))
                .collect(Collectors.joining());
        System.out.println(baseString);
        System.out.println(Pattern.compile(patternString).matcher(baseString).find());


        for (String s : wordsSet) {
            Pattern p1 = Pattern.compile(s + 4 + 12 + s);
            Pattern p2 = Pattern.compile(new StringBuilder(s).reverse().toString());

//            for (String cur : pull) {
//                System.out.println(p1.matcher(cur).results().map(x -> cur + ": " + x.start() + " " + x.end()).collect(Collectors.toList()));
////                        while
//                if (p1.matcher(cur).find() || p2.matcher(cur).find()) {
//                    Word word = new Word(s);
//                    res.add(word);
//                }
//            }

        }


        return res;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
