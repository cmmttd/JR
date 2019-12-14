package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
//            javaRush.users.add(new User("Vasilii", "Swarcsh", new Date(), true, User.Country.RUSSIA)); //Invalid!!!
            javaRush.users.add(null);
            User u1 = new User();
            u1.setFirstName("name");
            u1.setLastName("secName");
            u1.setBirthDate(new Date());
            u1.setMale(true);
            u1.setCountry(User.Country.RUSSIA);
            javaRush.users.add(u1);

            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush);
            System.out.println(loadedObject);
            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        @Override
        public String toString() {

            return this.users
                    .stream()
                    .map(User::toString)
                    .collect(Collectors.joining("\n"));
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter pw = new PrintWriter(outputStream);
            if (!users.isEmpty()) {
//                users.forEach(x -> pw.println(x.toString())); //Invalid!!!
                for (User us : users) {
                    if (us != null) pw.println(us.toString());
                    else pw.println("Null");
                }

            } else {
                pw.println("Empty gist");
            }
            pw.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//            br.lines().forEach(System.out::println);
            String temp = br.readLine();
            if (!"Empty gist".equals(temp)) {
                for (; temp != null; temp = br.readLine()) {
                    if (!temp.equals("Null")) {
                        String[] data = temp.split(";");

                        String name = data[0];
                        String secName = data[1];
                        Date bd = new Date(Long.parseLong(data[2]));
                        boolean male = data[3].equals("true");
                        User.Country cnt = data[4].equals("Ukraine") ? User.Country.UKRAINE :
                                data[4].equals("Russia") ? User.Country.RUSSIA :
                                        User.Country.OTHER;

                        User cur = new User();
                        cur.setFirstName(name);
                        cur.setLastName(secName);
                        cur.setBirthDate(bd);
                        cur.setMale(male);
                        cur.setCountry(cnt);
                        users.add(cur);
                    } else users.add(null);
                }
            }
            br.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
