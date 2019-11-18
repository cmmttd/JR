package com.javarush.task.task19.task1905;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem{

        private Contact contact;
        private Customer customer;

        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        @Override
        public String getCountryCode() {    //For example: UA
            return countries.entrySet()
                    .stream()
                    .filter(entry -> Objects.equals(entry.getValue(), customer.getCountryName()))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.joining());
        }

        @Override
        public String getCompany() {        //For example: JavaRush Ltd.
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {   //For example: Ivan
            return contact.getName().split(", ")[1];
        }

        @Override
        public String getContactLastName() {    //For example: Ivanov
            return contact.getName().split(", ")[0];
        }

        @Override
        public String getDialString() {         //For example: callto://+380501234567
            String[] numb = contact.getPhoneNumber().split("\\D");
            return "callto://+" + Arrays.stream(numb).collect(Collectors.joining());
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA
        String getCompany();            //For example: JavaRush Ltd.
        String getContactFirstName();   //For example: Ivan
        String getContactLastName();    //For example: Ivanov
        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.
        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan
        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}