package org.example;

public class Ex9 {

    public static void main(String[] args) {
        int [][] table = new int[10][10];
        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
    table [i][j] = (i+1)*(j+1);
    System.out.printf("%5d ", table[i][j]);
            }
System.out.println();
        }
    }
}
