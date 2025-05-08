//Addition Of Two Numbers
package ConditionalLoops.Basics;

import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
//        int num1 = 5; // First number
//        int num2 = 10; // Second number
//        int sum = num1 + num2; // Sum of the two numbers
//        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2= sc.nextInt();
        int sum = num1 + num2; // Sum of the two numbers
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
