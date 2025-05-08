//Curved Surface Area Of Cylinder
package ConditionalLoops.Basics;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
//        double radius = 5.0; // Radius of the cylinder
//        double height = 10.0; // Height of the cylinder
//        double curvedSurfaceArea = 2 * Math.PI * radius * height; // Curved surface area formula for cylinder
//        System.out.println("Curved surface area of the cylinder with radius " + radius + " and height " + height + " is: " + curvedSurfaceArea);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder : ");
        double radius= sc.nextDouble();
        System.out.println("Enter the height of the cylinder : ");
        double height= sc.nextDouble();
        double curvedSurfaceArea = 2 * Math.PI * radius * height; // Curved surface area formula for cylinder
        System.out.println("Curved surface area of the cylinder with radius " + radius + " and height " + height + " is: " + curvedSurfaceArea);
    }
}
