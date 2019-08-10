package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут

        reset();

    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try{
            String string = bufferedReader.readLine();

            if (string.equals("helicopter")) result = new Helicopter();
            else if (string.equals("plane")) {
                result = new Plane(42);
                System.out.println(((Plane) result).getPassengers());
            }

            bufferedReader.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
