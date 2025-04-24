//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package InputOutputPrograms;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the principal amount");

        float principal = sc.nextFloat();
        System.out.println("Enter the time");
        float time=sc.nextFloat();
        System.out.println("Enter the rate");
        float rate=sc.nextFloat();

        float simpleIntrest=(principal*time*rate)/100;

        System.out.println("Simple intrest is : "+simpleIntrest);
    }
}
