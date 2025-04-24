import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to be reversed");
        int n= sc.nextInt();
        int reverseNum=0;
        int remender=0;

        while(n>0) {
            remender=n%10;
            n=n/10;
            reverseNum=reverseNum*10+remender;

        }
        System.out.println(reverseNum);

    }
}
