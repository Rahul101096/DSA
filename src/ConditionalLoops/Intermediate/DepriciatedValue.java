//Calculate Depreciation of Value
package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class DepriciatedValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double principal= sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double rate= sc.nextDouble();
        System.out.println("Enter the time in years");
        double time= sc.nextDouble();
//        System.out.println("Enter the number of times interest is compounded per year");
//        double n= sc.nextDouble();
//        double amount= principal*Math.pow((1+rate/(n*100)),n*time); // Amount formula for compound interest
//        double depriciatedValue= principal-amount; // Depriciated value formula
        double depriciatedValue= principal*Math.pow(1-(rate/100),time); // Depriciated value formula
        System.out.println("The depriciated value of the amount is: " + depriciatedValue);
    }
}
