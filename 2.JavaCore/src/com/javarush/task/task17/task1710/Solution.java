package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        try {
            switch (args[0]) {
                case ("-c"):
                    String name = args[1];
                    boolean sex = args[2].equals("м") ? true : false;
                    Date bd = new SimpleDateFormat("dd/M/yyyy").parse(args[3]);
                    if (sex) allPeople.add(Person.createMale(name, bd));
                    else allPeople.add(Person.createFemale(name, bd));
                    System.out.println(allPeople.size() - 1);
                    break;
                case ("-u"):
                    int index = Integer.valueOf(args[1]);
                    name = args[2];
                    sex = args[3].equals("м") ? true : false;
                    bd = new SimpleDateFormat("dd/M/yyyy").parse(args[4]);
                    allPeople.get(index).setName(name);
                    allPeople.get(index).setSex(sex ? Sex.MALE : Sex.FEMALE);
                    allPeople.get(index).setBirthDate(bd);
                    break;
                case ("-d"):
                    index = Integer.valueOf(args[1]);
                    allPeople.get(index).setName(null);
                    allPeople.get(index).setSex(null);
                    allPeople.get(index).setBirthDate(null);
                    break;
                case ("-i"):
                    System.out.println(allPeople.get(Integer.valueOf(args[1])));
                    break;
                default:
                    System.err.println("Only this flags is valid: -c/-u/-d/-i");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
