package ConditionalLoops.Basics;

import java.util.Scanner;

public class SumProdDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n= sc.nextInt();
        int sum=0;
        int product=1;
        int difference=0;
        int remainder=0;
        while(n>0) {
            remainder=n%10; // Get the last digit
            sum+=remainder; // Add to sum
            product*=remainder; // Multiply to product
            //difference-=remainder; // Subtract from difference
            n=n/10; // Remove the last digit
            difference=product-sum; // Calculate difference
        }
        System.out.println("Difference of digits: " +difference);
    }
}
