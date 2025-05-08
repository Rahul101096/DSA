//Perimeter Of Square
package ConditionalLoops.Basics;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
//        double side = 5.0; // Length of the side of the square
//        double perimeter = 4 * side; // Perimeter formula for square
//        System.out.println("Perimeter of the square with side " + side + " is: " + perimeter);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the square");
        double side= sc.nextDouble();
        double perimeter = 4 * side; // Perimeter formula for square
        System.out.println("Perimeter of the square with side " + side + " is: " + perimeter);
    }
}
