package org.example;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();
        System.out.printf("Hello " + firstName+ "!");
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        System.out.printf("Nice to meet you " + firstName + lastName);
        System.out.println(" What is your birthdate,"+ firstName+"?");
        String birthDate = scanner.nextLine();
        System.out.println("Your birthdate is on" + birthDate);
        System.out.printf("That is nice " + firstName + lastName);
    }
}
