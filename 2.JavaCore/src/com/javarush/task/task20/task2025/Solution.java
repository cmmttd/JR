package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        try {
            if (N > 0 && N < Long.MAX_VALUE) {
                ArrayList<Long> arrayList = new ArrayList<>();
                for (long i = 1; i < N; i++) {
                    if (getSum(i)) arrayList.add(i);
                }
                return arrayList.stream().mapToLong(Long::longValue).toArray();
            } else throw new NumberFormatException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean getSum(long current) {
        long temp = current,
                sum = 0;
        int power = 1;

        for (; temp >= 10; temp /= 10) {
            power++;
        }
        for (temp = current; temp >= 10; temp /= 10) {
            sum += Math.pow(temp % 10, power);
        }
        sum += Math.pow(temp, power);
        return current == sum;
    }

    public static void main(String[] args) {
//        long[] res = getNumbers(3);
//        Arrays.stream(res).forEach(x -> System.out.print(x + " "));
    }
}
