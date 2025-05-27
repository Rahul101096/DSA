//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package Functions;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        //double radius = 5.0; // Example radius
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        System.out.println("Area of the circle with radius " + radius + " is: " + area);
        System.out.println("Circumference of the circle with radius " + radius + " is: " + circumference);

    }

    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static double calculateDiameter(double radius) {
        return 2 * radius;
    }
//    Scanner sc=new Scanner(System.in);
//    double r=sc.nextDouble();
//    //int b=sc.nextInt();
//    double cercumference=findCercumference(r);
//        System.out.println("Cercumference of circle is : "+cercumference);
//    double area=findArea(r);
//        System.out.println("Area of circle is : "+area);
//
//}
//public static double findCercumference(double r) {
//    double cercumference=2*3.14*r;
//    return cercumference;
//}
//
//public static double findArea(double r) {
//    double area=3.14*Math.pow(r, 2);
//    return area;
//}
}
