//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package FlowOfProgram;

import java.util.Scanner;

public class UserInputSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int x = in.nextInt();
        while (x > 0) {
            sum = sum + x;
            x = in.nextInt();
        }
        System.out.print(sum+" ");
    }
}
