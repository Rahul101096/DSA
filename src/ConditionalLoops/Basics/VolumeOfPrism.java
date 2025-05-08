//Volume Of Prism
package ConditionalLoops.Basics;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
//        double baseArea = 20.0; // Area of the base of the prism
//        double height = 10.0; // Height of the prism
//        double volume = baseArea * height; // Volume formula for prism
//        System.out.println("Volume of the prism with base area " + baseArea + " and height " + height + " is: " + volume);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base area of the prism");
        double baseArea= sc.nextDouble();
        System.out.println("Enter the height of the prism");
        double height= sc.nextDouble();
        double volume = baseArea * height; // Volume formula for prism
        System.out.println("Volume of the prism with base area " + baseArea + " and height " + height + " is: " + volume);
    }
}
