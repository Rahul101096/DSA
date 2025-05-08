//Perimeter Of Rhombus
package ConditionalLoops.Basics;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
//        double side = 5.0; // Length of the side of the rhombus
//        double perimeter = 4 * side; // Perimeter formula for rhombus
//        System.out.println("Perimeter of the rhombus with side " + side + " is: " + perimeter);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the rhombus");
        double side= sc.nextDouble();
        double perimeter = 4 * side; // Perimeter formula for rhombus
        System.out.println("Perimeter of the rhombus with side " + side + " is: " + perimeter);
    }
}
