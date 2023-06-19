package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
// Loop through each multiplier from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Compute the product of the input number and the current multiplier
            int product = numberTableToPrint * i;
            // Print the product in a formatted string
            System.out.printf("%d x %d = %d%n", i, numberTableToPrint, product);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int input = scanner.nextInt();
        // Validate the input to ensure it is positive
        if (input < 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            // Print the multiplication table of the input number
            new MultiplicationTable().printTable(input);
        }
    }
}
/*
// Loop through each multiplier from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Compute the product of the input number and the current multiplier
            int product = numberTableToPrint * i;
            // Print the product in a formatted string
            System.out.printf("%d x %d = %d%n", numberTableToPrint, i, product);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int input = scanner.nextInt();
        // Validate the input to ensure it is positive
        if (input <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            // Print the multiplication table of the input number
            new MultiplicationTable().printTable(input);
        }
 */