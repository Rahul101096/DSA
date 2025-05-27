//Find if a number is palindrome or not
package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class NumberPalindrom {
    public static void main(String[] args) {

//        int num = 121; // Example number
//        int originalNum = num; // Store the original number
//        int reversedNum = 0; // Variable to store the reversed number
//
//        // Reverse the number
//        while (num != 0) {
//            int digit = num % 10; // Get the last digit
//            reversedNum = reversedNum * 10 + digit; // Build the reversed number
//            num /= 10; // Remove the last digit from the original number
//        }
//
//        // Check if the original number is equal to the reversed number
//        if (originalNum == reversedNum) {
//            System.out.println(originalNum + " is a palindrome.");
//        } else {
//            System.out.println(originalNum + " is not a palindrome.");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome: ");
         // Take input from user
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num>0) {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
