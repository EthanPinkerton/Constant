package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numb = input.nextInt();

        if ((numb % 2) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        divideAndMod();
        Numbers.numbers();
    }

    public static void divideAndMod() {
        Scanner anotherInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = anotherInput.nextInt();
        System.out.print("Enter a second number: ");
        int secondUserInput = anotherInput.nextInt();
        System.out.println(userInput/secondUserInput);
        System.out.println(userInput%secondUserInput);
    }

    public static void average(){
        Scanner moreInput = new Scanner((System.in));
        int numb1 = moreInput.nextInt();
        int numb2 = moreInput.nextInt();
        int numb3 = moreInput.nextInt();
        int numb4 = moreInput.nextInt();
        int numb5 = moreInput.nextInt();
    }
}
