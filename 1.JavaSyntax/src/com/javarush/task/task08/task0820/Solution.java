package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            Cat cc = new Cat();
            result.add(cc);
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogs = new HashSet<Dog>();

        //Dog dd = new Dog();
        for (int i = 0; i < 3; i++) {
            Dog dd = new Dog();
            dogs.add(dd);
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> sum = new HashSet<Object>();
        sum.addAll(cats);
        sum.addAll(dogs);
        return sum;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Set<Object> buffer = new HashSet<Object>(cats);
        pets.removeAll(buffer);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator<Object> it = pets.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    //напишите тут ваш код

    public static class Cat {
    }

    public static class Dog {
    }
}
