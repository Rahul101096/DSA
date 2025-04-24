//Take name as input and print a greeting message for that particular name.
package InputOutputPrograms;

import java.util.Scanner;

public class GreeetingProgram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Guest Name : ");
        String name=sc.next();
        System.out.println("Dear "+name+" Welcome to the DSA Practice");
    }
}
