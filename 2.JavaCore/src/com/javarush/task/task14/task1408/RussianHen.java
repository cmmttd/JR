package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{

    private String country;
    private static int count = 0;

//    public Hen(String country){
//        this.country = country;
//    }

    @Override
    public int getCountOfEggsPerMonth() {
        return count;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - " + country + ". Я несу " + count + " яиц в месяц.";
    }
}
