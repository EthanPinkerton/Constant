package com.company;

import java.util.Scanner;

public class Numbers {
    public static void numbers() {
        int[] userNumbers = {0, 0, 0, 0, 0};

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            userNumbers[i] = input.nextInt();
        }
    }
}
