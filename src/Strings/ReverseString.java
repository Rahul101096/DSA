package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s="Rahul";
        reverseString1(s);
        System.out.println(reverseString2(s));
    }

    //First Apparoch
    public static void reverseString1(String s) {

       StringBuffer sb=new StringBuffer(s);
       sb.reverse();
       System.out.println(sb);
    }

    //Second Approach
    public static String reverseString2(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--) {

            res.append(s.charAt(i));

        }

        return res.toString();
    }
}
