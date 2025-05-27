package Functions;

import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int sum=doSum(a, b);
        System.out.println(" Sum of two no is : "+sum);
    }
    public static int doSum(int a,int b) {
        return a+b;
    }
    }

