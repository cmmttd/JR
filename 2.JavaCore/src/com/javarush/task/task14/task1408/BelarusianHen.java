package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    static String country = Country.BELARUS;
    static int count = 11;

    @Override
    public int getCountOfEggsPerMonth() {
        return count;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + count + " яиц в месяц.";
    }
}
