package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{

    private String country;
    private int count;

    @Override
    public int getCountOfEggsPerMonth() {
        return count;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - " + country + ". Я несу " + count + " яиц в месяц.";
    }
}
