//Take two numbers and print the sum of both.
package FlowOfProgram;

import java.util.Scanner;

public class SumProgran {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum of two no is : "+sum);
    }
}
