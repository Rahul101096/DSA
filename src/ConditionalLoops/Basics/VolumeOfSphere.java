//Volume Of Sphere
package ConditionalLoops.Basics;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
//        double radius = 5.0; // Radius of the sphere
//        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Volume formula for sphere
//        System.out.println("Volume of the sphere with radius " + radius + " is: " + volume);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the sphere");
        double radius= sc.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Volume formula for sphere
        System.out.println("Volume of the sphere with radius " + radius + " is: " + volume);
    }
}
