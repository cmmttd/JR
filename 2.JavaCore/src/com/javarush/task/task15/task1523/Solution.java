package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    public Solution(){}

    private Solution(String s){
        System.out.println("string");
    }

    protected Solution(Integer i) {
        System.out.println("Integer");
    }

    Solution(double dd){
        System.out.println("double");
    }

    public static void main(String[] args) {

    }
}

