//Input a number and print all the factors of that number (use loops).
package ConditionalLoops.Basics;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to count its factors : ");
        int num= sc.nextInt();
        int count=0;
        for(int i=1; i<=num; i++) {
            if(num%i==0) {
                count++;
                System.out.println(i + " is a factor of " + num);
            }

        }
        System.out.println("The number of factors of " + num + " is : " + count);
    }
}
