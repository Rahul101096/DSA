//Armstrong Number In Java
package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if it is an Armstrong number:");
        // Take input from user
        int number = sc.nextInt();
        //int number = 153; // Example number
        int originalNumber = number;
        int result = 0;
        int digits = String.valueOf(number).length(); // Count the number of digits

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            result += Math.pow(digit, digits); // Raise to the power of the number of digits and add to result
            number /= 10; // Remove the last digit
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number to check if it is an Armstrong number:");
//         // Take input from user
//         //int num = sc.nextInt();
//        int num=sc.nextInt();
//        int sum=0;
//        int digits=String.valueOf(num).length(); // Count the number of digits
//        int temp=num;
//        while(num>0) {
//           int rem=num%10;
//            sum+=Math.pow(rem, digits);
//            num=num/10;
//        }
//        if(temp==sum) {
//            System.out.println("Armstrong Number");
//        } else {
//            System.out.println("Not a Armstrong Number");
//        }
    }
}
