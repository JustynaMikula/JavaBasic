package org.example;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide new password");
        String newPassword = scanner.nextLine();
        String errorMessage = "";
        boolean passwordChanged = true;
        if (newPassword.matches(".*\\d+.*")){
        } else {
             errorMessage = "Password should contain at least one digit.\n";
             passwordChanged = false;
        }
        if (newPassword.length()<8) {
            errorMessage = "Password should have at least 8 characters";
            passwordChanged = false;
        } if (passwordChanged){
        System.out.println("Password changed");
        } else {
        System.out.println("Try again");
        System.out.println(errorMessage);
    }}
}
