
//Area Of Triangle
package ConditionalLoops.Basics;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the breadth of the Triangle : ");
        float b=sc.nextFloat();
        System.out.print("Emter the hight of the triangle |: ");
        float h=sc.nextFloat();
        double A=(h*b)*1/2;
        System.out.println("Area of the triangle is : "+A);
    }
}
