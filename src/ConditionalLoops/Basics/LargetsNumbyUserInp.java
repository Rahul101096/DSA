//Take integer inputs till the user enters 0 and print the largest number from all.
package ConditionalLoops.Basics;

import java.util.Scanner;

public class LargetsNumbyUserInp {
    public static void main(String[] args) {
        //        int num1 = 10;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number (0 to stop): ");
        int num = sc.nextInt();
        int largestNum = num; // Initialize largestNum with the first input

        while (num != 0) { // Continue until user enters 0
            if (num > largestNum) { // Check if the current number is larger
                largestNum = num; // Update largestNum
            }
            System.out.println("Enter a number (0 to stop): ");
            num = sc.nextInt(); // Read next user input
        }
        System.out.println("The largest number entered is: " + largestNum); // Print the largest number
    }


}
