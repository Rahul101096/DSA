//Sum Of N Numbers
package ConditionalLoops.Intermediate;

public class SumOfNNum {
    public static void main(String[] args) {
        int n = 5; // Number of terms to sum
        int sum = 0; // Variable to store the sum

        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to the sum
        }

        System.out.println("The sum of the first " + n + " numbers is: " + sum); // Print the result
    }
}
