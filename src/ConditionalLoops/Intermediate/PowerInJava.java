//Power In Java
package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
//        int base = 2; // Base number
//        int exponent = 3; // Exponent
//        int result = 1; // Initialize result
//
//        // Calculate power using a loop
//        for (int i = 0; i < exponent; i++) {
//            result *= base; // Multiply result by base
//        }
//
//        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + result);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the base number");
//        int base = sc.nextInt();
//        System.out.println("Enter the exponent number");
//        int exponent = sc.nextInt();
//        int result = 1;
//        // Calculate power using a loop
//        for (int i = 0; i < exponent; i++) {
//            result *= base; // Multiply result by base
//        }
//        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + result);
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number");
        int base = sc.nextInt();
        System.out.println("Enter the exponent number");
        double exponent = sc.nextInt();
        double result = 1;
        // Calculate power using a loop
        result= Math.pow(base, exponent);
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + result);
    }

}
