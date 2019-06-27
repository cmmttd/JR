package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лира"); // 1
        list.add("лоза"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String s: list){
            int pcount = 0, lcount = 0;
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == 'р'){
                    pcount = 1;
                }
                if (s.charAt(i) == 'л'){
                    lcount = 1;
                }
            }
            if (lcount == 1){
                if (pcount == 1){
                    arrayList.add(s);
                }
                else{
                    arrayList.add(s);
                    arrayList.add(s);
                }
                continue;
            }
            if (pcount != 1){
                arrayList.add(s);
            }
        }
        return arrayList;
    }
}