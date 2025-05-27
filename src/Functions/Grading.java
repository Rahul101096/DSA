package Functions;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks obtained : ");
        double marksObtained=sc.nextDouble();
        //double marks=0;
        double grade=calculateGrade(marksObtained);
        System.out.println("Obtained Mark is : "+grade);
    }
    public static double calculateGrade(double marks) {
        if(marks >=91 && marks <=100) {
            System.out.println("AA Grade");
        } else if(marks>=81 && marks<=90) {
            System.out.println("AB Grade");
        } else if(marks>=71 && marks <= 80) {
            System.out.println("BB Grade");
        } else if(marks>=61 && marks <= 70) {
            System.out.println("BC Grade");
        } else if(marks>=51 && marks <= 60) {
            System.out.println("CD Grade");
        } else if(marks>=41 && marks <= 50) {
            System.out.println("DD Grade");
        } else {
            System.out.println("Fail");
        }
        return marks;
    }
}
