package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i, summ = 0, counter = 0;
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            if (i == -1) {
                System.out.println((float)summ/counter);
                break;
            }
            summ += i;
            counter++;
        }
    }
}

