package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{

    static String country = Country.RUSSIA;
    static int count = 7;

    @Override
    public int getCountOfEggsPerMonth() {
        return count;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + count + " яиц в месяц.";
    }
}
