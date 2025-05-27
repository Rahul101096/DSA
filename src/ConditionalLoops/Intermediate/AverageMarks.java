//
package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of subjects : ");
        int totalSubject=sc.nextInt();
        double totalMarks=0;
        for(int i=1; i<=totalSubject; i++) {
            System.out.println("Enter the marks of subject " + i + " : ");
            double marks=sc.nextDouble();
            totalMarks=totalMarks+marks;
        }
        double avg=totalMarks/totalSubject;
        System.out.println("The average marks of " + totalSubject + " subjects is : " + avg);
        //System.out.println(avg);
        if(avg>=90) {
            System.out.println("Grade A");
        } else if(avg>=80 && avg<90) {
            System.out.println("Grade B");
        } else if(avg>=70 && avg<80) {
            System.out.println("Grade C");
        } else if(avg>=60 && avg<70) {
            System.out.println("Grade D");
        } else if(avg>=50 && avg<60) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
