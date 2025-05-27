//Find Ncr & Npr
package ConditionalLoops.Intermediate;

public class NCRAndNPR {
    public static void main(String[] args) {
        int n = 5; // Total number of items
        int r = 3; // Number of items to choose

        // Calculate nCr (Combination)
        int nCr = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("nCr: " + nCr);

        // Calculate nPr (Permutation)
        int nPr = factorial(n) / factorial(n - r);
        System.out.println("nPr: " + nPr);
    }
    // Function to calculate factorial
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
