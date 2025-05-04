//Input a year and find whether it is a leap year or not.
package FlowOfProgram;

import java.util.Scanner;

public class LeapYearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter year to be check : ");
        int year = sc.nextInt();

        /*if(year%100==0) {
            if (year % 400 == 0) {
                System.out.println("Leap year");
            }
        }else {
            System.out.println("Not a leap year");
        }*/
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is Leap year");
                } else {
                    System.out.println(year + " is Not leap year");
                }
                } else {
                System.out.println(year + " is leap year");
                }
            } else {
            System.out.println(year + " is not leap year");
        }
    }
}