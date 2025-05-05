//Area Of Rectangle Program
package ConditionalLoops.Basics;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the rectangel : ");
        float l=sc.nextFloat();
        System.out.print("Enter the width of the rectangle : ");
        float w=sc.nextFloat();
        double A=l*w;
        System.out.println("Area of the rectangle is : "+A);
    }
}
