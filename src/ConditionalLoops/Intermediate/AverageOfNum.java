//Calculate Average Of N Numbers
package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class AverageOfNum {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the numbers : ");
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();
//        int num3=sc.nextInt();
//        double avg=0;
//        avg=(num1+num2+num3)*100/300;
//        System.out.println("Average : "+avg);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            double num = sc.nextDouble();
            sum += num;
        }
        double average = sum / n;
        System.out.println("Average: " + average);
    }
}
