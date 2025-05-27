package Functions;

//Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;

public class ProductOfTwoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=multi(a, b);
        System.out.println(" Product of two no is : "+product);
    }
    public static int multi(int a,int b) {
        return a*b;
    }

}
