//Input currency in rupees and output in USD.
package InputOutputPrograms;

import java.util.Scanner;

public class INRtoUSDConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the INR amount");
        float inr=sc.nextFloat();

        double usd= inr*0.012;

        System.out.println(inr+" rs inr is equal to "+usd+" usd");
    }
}
