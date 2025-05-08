package ConditionalLoops.Basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series : ");
        int n= sc.nextInt();
        int n1 = 0; // First term
        int n2 = 1; // Second term
        for(int i=0; i<n; i++) {
            System.out.print(n1 + " "); // Print the current term
            int n3 = n1 + n2; // Calculate the next term
            n1 = n2; // Update n1 to the second term
            n2 = n3; // Update n2 to the next term
        }
    }
}
