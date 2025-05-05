//Area Of Rhombus
package ConditionalLoops.Basics;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base : ");
        float b=sc.nextFloat();
        System.out.print("Enter the hight : ");
        float h=sc.nextFloat();
        double a=(b*h);
        System.out.println("Area of Rhombus is : "+a);
    }
}
