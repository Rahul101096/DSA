//To calculate Fibonacci Series up to n numbers.
package InputOutputPrograms;

import java.util.Scanner;

public class FebonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        for(int i =0; i<n; i++) {
            System.out.println(n1);
            //System.out.println(n2);
            int n3=n1+n2;
            n1=n2;
            n2=n3;
           // System.out.println(n3);
        }

       // System.out.println("Febonacci series of "+n+" is "+n3);


    }
}
