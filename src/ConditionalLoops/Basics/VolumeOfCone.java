//Volume Of Cone Java Program
package ConditionalLoops.Basics;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
//        double radius = 5.0; // Radius of the base of the cone
//        double height = 10.0; // Height of the cone
//        double volume = (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height; // Volume formula for cone
//        System.out.println("Volume of the cone with radius " + radius + " and height " + height + " is: " + volume);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cone");
        double radius= sc.nextDouble();
        System.out.println("Enter the height of the cone");
        double height= sc.nextDouble();

        double volume = (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height; // Volume formula for cone
        System.out.println("Volume of the cone with radius " + radius + " and height " + height + " is: " + volume);
    }
}
