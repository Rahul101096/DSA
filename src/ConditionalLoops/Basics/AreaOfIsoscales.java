//Area Of Isosceles Triangle
package ConditionalLoops.Basics;

import java.util.Scanner;

public class AreaOfIsoscales {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base : ");
        float b=sc.nextFloat();
        System.out.print("Enter the hight : ");
        float h=sc.nextFloat();
        double a=(b*h)*1/2;
        System.out.println("Area of Isoscales Triangle is : "+a);
    }
}
