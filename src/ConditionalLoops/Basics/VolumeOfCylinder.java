//Volume Of Cylinder
package ConditionalLoops.Basics;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder : ");
        double radius= sc.nextDouble();
        System.out.println("Enter the height of the cylinder : ");
        double height= sc.nextDouble();
        double volume= Math.PI*Math.pow(radius,2)*height; // Volume formula for cylinder
        System.out.println("Volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);
    }
}
