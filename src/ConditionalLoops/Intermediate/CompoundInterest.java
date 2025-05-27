package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        double pricipalAmnt=sc.nextDouble();
        System.out.print("Enter the rate of interest : ");
        double rate=sc.nextDouble();
        System.out.print("Enter the time in years : ");
        int time=sc.nextInt();
        double compoundInterest=pricipalAmnt*Math.pow(1+rate/100, time);
        System.out.println("Compound Interest : "+compoundInterest);

    }
}
