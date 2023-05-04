package org.example;

public class Ex1 {
    public static void main(String[] args) {

        int firstInt = 23;
        long firstLong = 345L;
        float firstFloat = 43.1F;
        double firstDouble = 34.555;
        String firstString = "Hi everyone";

        System.out.println("firstInt:" + firstInt);
        System.out.println("firstLong:" + firstLong);
        System.out.println("firstFloat:" + firstFloat);
        System.out.println("firstDouble:" + firstDouble);
        System.out.println("firstString:" + firstString);

        //emploee
        String name = "Jacek";
        String surname = "Nowak";
        int age = 23;
        System.out.println(name + " " + surname + " " + age);

        //account
        String accountNumber = "USD0098654327908";
        String currencyCode = "USD";
        long amount = 200000;

        System.out.println(accountNumber + " " + currencyCode + " " + amount);
    }
}


