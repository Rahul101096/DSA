//Perimeter Of Rectangle
package ConditionalLoops.Basics;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        /*double length = 5.0; // Length of the rectangle
        double width = 3.0; // Width of the rectangle
        double perimeter = 2 * (length + width); // Perimeter formula for rectangle
        System.out.println("Perimeter of the rectangle with length " + length + " and width " + width + " is: " + perimeter);
    */
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double length= sc.nextDouble();
        System.out.println("Enter the width of the rectangle");
        double width= sc.nextDouble();
        double perimeter = 2 * (length + width); // Perimeter formula for rectangle
        System.out.println("Perimeter of the rectangle with length " + length + " and width " + width + " is: " + perimeter);
    }
}
