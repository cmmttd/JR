package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String s = reader.readLine();
                Movie movie = MovieFactory.getMovie(s);
                if (!isFind(s)) break;
                System.out.println(movie.getClass().getSimpleName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    private static boolean isFind(String str) {
        if (str.equals("soapOpera")) return true;
        else if (str.equals("thriller")) return true;
        else if (str.equals("cartoon")) return true;
        else return false;
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) movie = new Cartoon();
            else if ("thriller".equals(key)) movie = new Thriller();

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }


}
