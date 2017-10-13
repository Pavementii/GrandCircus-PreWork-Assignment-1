package com.robinsondetroit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTheory trial = new StringTheory();

        System.out.println("Please enter two integer numbers with the same number of digits.");

        System.out.println("First number: ");
        String var1 = sc.nextLine();

        System.out.println("Second number: ");
        String var2 = sc.nextLine();

        while (!trial.isValidInput(var1, var2)) {
            System.out.println("\nSorry the two entries either are not the same length or they aren't numbers. \nPlease try again.");
            System.out.println("\nFirst number: ");
            var1 = sc.nextLine();

            System.out.println("Second number: ");
            var2 = sc.nextLine();
        }

        System.out.println("\nI will now see if each corresponding place in the two numbers sums to the same total.\n\n");
        System.out.println(trial.passesTest(var1, var2));
        }
    }



