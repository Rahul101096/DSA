//To find out whether the given String is Palindrome or not.
package InputOutputPrograms;

import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.next();
        String rev="";
        for(int i=str.length()-1; i>=0; i--) {

            rev=rev+str.charAt(i);
        }
        if (rev.equals(str)) {
            System.out.println('"'+str+'"'+" is pelindrom");
        } else {
            System.out.println('"'+str+'"'+" is not pelindrom");
        }
    }
}
