package normalClass;

import java.util.Scanner;

public class Serkan01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the result to 1
        double result = 1;

        // Prompt the user to enter 5 numbers
        System.out.println("Enter 5 numbers: ");

        // Read in the numbers and multiply them together
        for (int i = 0; i < 5; i++) {
            result *= scanner.nextDouble();
        }

        // Print the result
        System.out.println("The result is: " + result);
    }
}
