package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    //напишите тут ваш код
    private String name;
    private int age;

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public static void main(String[] args)
    {
        Dog Shpire = new Dog();
        Shpire.setName("Шарик");
        Shpire.setAge(13);
        System.out.println(Shpire.getName() + Shpire.getAge());
    }
}
