package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException{
//        PersonScannerAdapter ps = new PersonScannerAdapter(new Scanner(new File("D:\\Prog\\JR\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1904\\test.txt")));
//        System.out.println(ps.read());
//        System.out.println(ps.read());
//        ps.close();
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] inp = fileScanner.nextLine().split("\\s");
            SimpleDateFormat df = new SimpleDateFormat("dd MM yyyy");
            String date = inp[3] + " " + inp[4] + " " + inp[5];
            try {
                return new Person(inp[1], inp[2], inp[0], df.parse(date));
            } catch (ParseException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
