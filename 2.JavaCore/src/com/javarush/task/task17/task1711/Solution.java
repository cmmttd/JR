package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.javarush.task.task17.task1711.Sex.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        switch (args[0]) {
            case ("-c"):
                String name;
                boolean sex;
                Date bd;
                String[] flags = Arrays.copyOfRange(args, 1, args.length);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
                try {
                    for (int i = 0; i < flags.length; ){
                        name = flags[i++];
                        sex = "м".equals(flags[i++]) ? true : false;
                        bd = sdf.parse(flags[i++]);
                        synchronized (allPeople){
                            if (sex) allPeople.add(Person.createMale(name, bd));
                            else allPeople.add(Person.createFemale(name, bd));
                            System.out.print(allPeople.size() - 1 + " ");
                        }
                    }
                } catch (ParseException e){
                    e.printStackTrace();
                }

                break;
            case ("-u"):
                int index;
                flags = Arrays.copyOfRange(args, 1, args.length);
                sdf = new SimpleDateFormat("dd/M/yyyy");
                try {
                    for (int i = 0; i < flags.length;) {
                        index = Integer.valueOf(flags[i++]);
                        name = flags[i++];
                        sex = "м".equals(flags[i++]) ? true : false;
                        bd = sdf.parse(flags[i++]);
                        synchronized (allPeople) {
                            allPeople.get(index).setName(name);
                            allPeople.get(index).setSex(sex ? MALE : FEMALE);
                            allPeople.get(index).setBirthDate(bd);
                        }
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case ("-d"):
                flags = Arrays.copyOfRange(args, 1, args.length);
                for (String s : flags) {
                    index = Integer.valueOf(s);
                    synchronized (allPeople) {
                        allPeople.get(index).setName(null);
                        allPeople.get(index).setSex(null);
                        allPeople.get(index).setBirthDate(null);
                    }
                }
                break;
            case ("-i"):
                for (String s : args) {
                    if (!"-i".equals(s))
                        synchronized (allPeople) {
                            System.out.println(allPeople.get(Integer.valueOf(s)));
                        }
                }
                break;
        }
    }
}



















