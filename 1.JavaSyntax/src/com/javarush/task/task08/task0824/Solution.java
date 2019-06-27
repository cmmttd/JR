package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws NullPointerException{
        //напишите тут ваш код
        //make a childs
        ArrayList<Human> emptyList = new ArrayList<Human>();
        Human child1 = new Human("Any", false, 12, emptyList);
        System.out.println(child1);
        Human child2 = new Human("One", true, 14, emptyList);
        System.out.println(child2);
        Human child3 = new Human("Else", false, 16, emptyList);
        System.out.println(child3);
        ArrayList<Human> childList = new ArrayList<Human>();
        childList.add(child1);
        childList.add(child2);
        childList.add(child3);
        //father
        Human dad = new Human("Ivan", true, 33, childList);
        System.out.println(dad);
        //mother
        Human mom = new Human("Marya", false, 32, childList);
        System.out.println(mom);
        ArrayList<Human> midAge0 = new ArrayList<Human>();
        midAge0.add(mom);
        ArrayList<Human> midAge1 = new ArrayList<Human>();
        midAge1.add(dad);
        //grFa0
        Human deda = new Human("Akop", true, 82, midAge0);
        System.out.println(deda);
        //grMa0
        Human baba = new Human("Agafya", false, 33, midAge0);
        System.out.println(baba);
        //grFa1
        Human deda1 = new Human("George", true, 51, midAge1);
        System.out.println(deda1);
        //grMa1
        Human baba1 = new Human("Anastasia", false, 50, midAge1);
        System.out.println(baba1);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(){

        }

        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
