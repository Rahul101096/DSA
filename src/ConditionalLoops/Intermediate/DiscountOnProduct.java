package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class DiscountOnProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Marked price : ");
        double mp=sc.nextDouble();
        System.out.println("Enter the selling price : ");
        double sp=sc.nextDouble();
        double discount=0;
        discount=mp-sp;
        double discountPercentage=(discount/mp)*100;
        System.out.println("Discount on the product is : "+discountPercentage);
    }
}
