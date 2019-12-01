package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human( null);
            ivanov.save(outputStream);
            outputStream.flush();
            System.out.println(ivanov);

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            System.out.println(somePerson);
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            if (somePerson.equals(ivanov)) System.out.println("Totally true");


        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter pw = new PrintWriter(outputStream);
            if (name != null) {
                pw.println(name);
                if (!assets.isEmpty()) {
                    assets.forEach(pw::println);
                } else pw.println("downshifter");
                pw.flush();
            } else {
                throw new IOException();
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(name).append("\n");
            assets.forEach(x -> sb.append(x).append(" | "));
            return sb.toString();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String s = br.readLine();
            if (s != null || s.equals("")) {
                this.name = s;
                if (!(s = br.readLine()).equals("downshifter")) {
                    for (; s != null; s = br.readLine()) {
                        assets.add(new Asset(s.split("#")[0], Double.parseDouble(s.split("#")[1])));
                    }
                }
            } else throw new IOException();

        }
    }
}
