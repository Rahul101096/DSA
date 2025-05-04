//Take a number as input and print the multiplication table for it.
package FlowOfProgram;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for table : ");
        int num=sc.nextInt();
        for(int i=1; i<=10;i++) {
            int mul=num*i;
            System.out.println(mul);
        }
    }
}
