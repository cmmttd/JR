package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {

    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution ex = new Solution();
        System.out.println(ex.intVar);
        System.out.println(ex.doubleVar);
        System.out.println(ex.DoubleVar);
        System.out.println(ex.booleanVar);
        System.out.println(ex.ObjectVar);
        System.out.println(ex.ExceptionVar);
        System.out.println(ex.StringVar);
    }
}
