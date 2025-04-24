//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package InputOutputPrograms;

import java.util.Scanner;

public class MathProgram {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Num : ");
        int num1=sc.nextInt();
        System.out.println("Enter the second Num : ");
        int num2=sc.nextInt();

        int sum=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int dev=num1/num2;
        System.out.println("Sum : "+sum);
        System.out.println("substractiion : "+sub);
        System.out.println("Multiplication : "+mul);
        System.out.println("Devision : "+dev);

    }
}
