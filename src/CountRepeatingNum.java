import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CountRepeatingNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the no to be count");
        int k=sc.nextInt();
        int count=0;
        int remender=0;

       /* for(int i=0; i<=n; i++){
            if(i==k){
                count=count+1;
            }
        }*/

        while(n>0) {
            remender=n%10;
            if(remender==k){
                count++;
            }
            n=n/10;
        }
        System.out.println(k+" is repeating "+count+" times");
    }
}
