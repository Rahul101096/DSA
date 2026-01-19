package Strings;

import java.sql.SQLOutput;

public class FirstNoneRepeating {

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(nonRepeating(s));
    }

    public static char nonRepeating(String s) {
        for (int i = 0; i < s.length(); ++i) {
            boolean found=false;
            for (int j = 0; j < s.length(); ++j) {
                if (i!=j && s.charAt(i) == s.charAt(j)) {
                    found=true;
                    break;
                }
            }
            if(!found) {
                return s.charAt(i);
            }
        }
        return '$';
    }
}
