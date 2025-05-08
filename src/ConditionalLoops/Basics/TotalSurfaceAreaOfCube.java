//Total Surface Area Of Cube
package ConditionalLoops.Basics;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
//        double side = 5.0; // Length of the side of the cube
//        double totalSurfaceArea = 6 * Math.pow(side, 2); // Total surface area formula for cube
//        System.out.println("Total surface area of the cube with side " + side + " is: " + totalSurfaceArea);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the cube : ");
        double side= sc.nextDouble();
        double totalSurfaceArea = 6 * Math.pow(side, 2); // Total surface area formula for cube
        System.out.println("Total surface area of the cube with side " + side + " is: " + totalSurfaceArea);

    }
}
