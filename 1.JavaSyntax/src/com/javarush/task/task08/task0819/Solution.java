package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        printCats(cats);
        Iterator iterator = cats.iterator();
        iterator.next();
        iterator.remove();
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        HashSet<Cat> cats = new HashSet<Cat>();
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        cats.add(c1);
        cats.add(c2);
        cats.add(c3);
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat c : cats) {
            System.out.println(c);
        }
    }

    // step 1 - пункт 1
    public static class Cat {
    }
}
