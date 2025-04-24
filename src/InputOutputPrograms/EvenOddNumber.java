/*Write a program to print whether a number is even or odd, also take input from the user.
*/
package InputOutputPrograms;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no to check the no to check even or odd : ");

        int num=sc.nextInt();

        if(num%2==0) {
            System.out.println(num+" is Even number");
        } else {
            System.out.println(num+" is Odd Number");
        }

    }
}
