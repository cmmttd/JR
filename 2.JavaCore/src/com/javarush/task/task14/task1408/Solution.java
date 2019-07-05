package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory implements Country{

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country )
            return hen;
        }
    }

}

//TODO: 1. Make constructor in any CountryHen (String country) & eggCount++
//      2. Write logic in Country class when take a String and get Hen

