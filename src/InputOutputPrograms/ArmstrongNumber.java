//To find Armstrong Number between two given number.
package InputOutputPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        int digits=0;
        int sum=0;
        while(temp>0) {
             temp=temp/10;
            digits++;

        }
        System.out.println("Numbers of digits : "+digits);
        temp=num;
        while(temp>0) {
            int lastDigit=temp%10;
            sum= (int) (sum+ Math.pow(lastDigit, digits));
            temp=temp/10;
        }
        System.out.println("Sum is : "+sum);
        if(sum==num) {
            System.out.println(num+" is a Armstrong number");
        } else {
            System.out.println(num+" is not a Armstrong number");
        }
    }
}
