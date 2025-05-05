//Area Of Parallelogram
package ConditionalLoops.Basics;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base : ");
        float b=sc.nextFloat();
        System.out.print("Enter the hight : ");
        float h=sc.nextFloat();
        double a=(b*h);
        System.out.println("Area of Parallelogram is : "+a);
    }
}
