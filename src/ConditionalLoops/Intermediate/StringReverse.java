package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
//        String str = "Hello World";
//        String reversedStr = reverseString(str);
//        System.out.println("Original String: " + str);
//        System.out.println("Reversed String: " + reversedStr);
//    }
//    public static String reverseString(String str) {
//        StringBuilder reversed = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed.append(str.charAt(i));
//        }
//        return reversed.toString();
//    }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String word = sc.next();
        char temp;
        String rev = "";

        for (int i = 0; i < word.length(); i++) {
            temp = word.charAt(i);
           // System.out.println("temp: " + temp);
            rev = temp + rev;
            //System.out.println("rev: " + rev);
        }
        System.out.println("Original String: " + word);
        System.out.println("Reversed String: " + rev);
        //System.out.println(rev);
    }
}
