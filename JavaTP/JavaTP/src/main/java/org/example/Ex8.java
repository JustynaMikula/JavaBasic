package org.example;

public class Ex8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of numbers is: " + sum);

            String[] FewNames = {"John", "Camila", "Natalie" };
            for (String names : FewNames) {
                System.out.println("Your name is" + names);
            }

    }
}



