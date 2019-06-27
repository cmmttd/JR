package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import java.io.*;
import java.util.Scanner;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код\
        return Math.sqrt((Math.pow((x1 - x2), 2)) + Math.pow((y1 - y2), 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(getDistance(x1, x2, y1, y2));
    }
}
