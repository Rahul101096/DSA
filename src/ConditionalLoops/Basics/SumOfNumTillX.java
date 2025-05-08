
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package ConditionalLoops.Basics;

import java.util.Scanner;

public class SumOfNumTillX {
    public static void main(String[] args) {
        /*int sum = 0;
        int num = 1; // Initialize num to a non-zero value to enter the loop

        while (num != 0) {
            System.out.print("Enter a number (0 to stop): ");
            num = new java.util.Scanner(System.in).nextInt(); // Read user input
            sum += num; // Add the number to the sum
        }

        System.out.println("The sum of all numbers entered is: " + sum);*/

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter a number (0 to stop): ");
//        int num = sc.nextInt();
//        int sum = 0; // Initialize sum to 0
//        while (num != 0) { // Continue until user enters 0
//            sum += num; // Add the number to the sum
//            System.out.println("Enter a number (0 to stop): ");
//            num = sc.nextInt(); // Read next user input
//        }
//        System.out.println("The sum of all numbers entered is: " + sum); // Print the total sum

        Scanner sc = new Scanner(System.in);
        int sum = 0; // Initialize sum to 0
        int num; // Declare num outside the loop

        do {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt(); // Read user input
            sum += num; // Add the number to the sum
        } while (num != 0); // Continue until user enters 0

        System.out.println("The sum of all numbers entered is: " + sum); // Print the total sum
    }
}
