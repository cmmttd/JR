package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> peop = new HashMap<String, Integer>();
        for (int i = 0; i < 10; i++){
            peop.put("Man no." + i, i + 495);
        }
        return peop;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getValue() < 500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
    }
}