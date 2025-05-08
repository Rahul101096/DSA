//Perimeter Of Parallelogram
package ConditionalLoops.Basics;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        /*double base = 5.0; // Length of the base of the parallelogram
        double height = 3.0; // Length of the height of the parallelogram
        double perimeter = 2 * (base + height); // Perimeter formula for parallelogram
        System.out.println("Perimeter of the parallelogram with base " + base + " and height " + height + " is: " + perimeter);
    */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of the parallelogram");
        double base= sc.nextDouble();
        System.out.println("Enter the height of the parallelogram");
        double height= sc.nextDouble();
        double perimeter = 2 * (base + height); // Perimeter formula for parallelogram
        System.out.println("Perimeter of the parallelogram with base " + base + " and height " + height + " is: " + perimeter);
    }
}
