//Area Of Circle Java Program
package ConditionalLoops.Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float r=sc.nextFloat();
        double area=3.14*r*r;
        System.out.println("Area of the circle is : "+area);

    }
}
