package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix((Number) m, (Number) n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Number a, Number b, Object c) {
        if (a instanceof Double && b instanceof Double) {
            printMatrix((Double) a, (Double) b, (String) c);
        } else if (a instanceof Integer && b instanceof Integer) {
            printMatrix((Integer) a, (Integer) b, c);
        } else if (a instanceof Float && b instanceof Float) {
            printMatrix((Float) a, (Float) b, c);
        } else if (a instanceof Short && b instanceof Long) {
            printMatrix((Short) a, (Long) b, c);
        } else if (a instanceof Long && b instanceof Short) {
            printMatrix((Long) a, (Short) b, c);
        } else if (a instanceof Long && b instanceof Long) {
            printMatrix((Long) a, (Long) b, c);
        } else {
            printMatrix((Object) a, (Object) b, c);
        }
    }

    public static void printMatrix(Double f, Double bar, String cap) {
        System.out.println("DDS");
    }

    public static void printMatrix(Integer a, Integer b, Object c) {
        System.out.println("IIO");
    }

    public static void printMatrix(Float a, Float b, Object c) {
        System.out.println("FFO");
    }

    public static void printMatrix(Long a, Long b, Object c) {
        System.out.println("LLO");
    }

    public static void printMatrix(Long a, Short b, Object c) {
        System.out.println("LSO");
    }

    public static void printMatrix(Short a, Long b, Object c) {
        System.out.println("SLO");
    }

    public static void printMatrix(Object a, Object b, Object c){
        System.out.println("OOO");
    }
}
