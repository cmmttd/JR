package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {

    static String country = Country.UKRAINE;
    static int count = 6;

    @Override
    public int getCountOfEggsPerMonth() {
        return count;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + count + " яиц в месяц.";
    }
}
