//Calculate Electricity Bill
package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class ElectricityBillCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double billAmount = 0.0;
        if (units <= 100) {
            billAmount = 0;
        } else if (units > 100 && units <= 200) {
            billAmount = units - 100;
            billAmount = billAmount * 5;

        } else if (units > 200 && units <= 300) {
            billAmount= (units - 200) * 10 + 500;
        }
        else if (units > 300 && units <= 400) {
            billAmount = (units - 300) * 15 + 1000;
        } else if (units > 400) {
            billAmount = (units - 400) * 20 + 1500;
        }
        System.out.println("Your bill amount is: " + billAmount);
    }

}
