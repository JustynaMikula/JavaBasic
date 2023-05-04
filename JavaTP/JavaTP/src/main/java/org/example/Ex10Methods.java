package org.example;

public class Ex10Methods {
    public static void main(String[] args) {
        int[] numbers = {15, 21, 9, 104, 6};

        System.out.println("Min is " + findMin(numbers));
    }

    static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    static double average(int[] numbers) {
        double average = sum(numbers) / (double)numbers.length;
        return average;
    }
}
