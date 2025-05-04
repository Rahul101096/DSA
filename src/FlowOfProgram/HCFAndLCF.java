//Take 2 numbers as inputs and find their HCF and LCM.
package FlowOfProgram;

import java.util.Scanner;

public class HCFAndLCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st num : ");
        int num1= sc.nextInt();
        System.out.println("enter 2nd num : ");
        int num2=sc.nextInt();
        int temp=0;
        for(int i=1; i<=num1; i++) {
            if(num1%i==0 && num2%i==0) {
                temp=i;
            }
        }
        System.out.println("HCF is : "+temp);
        int lcm=num1*num2/temp;
        System.out.println("LCM is : "+lcm);
    }
}
