//Define a program to find out whether a given number is even or odd using function
package Functions;

public class findEvenOdd {
    public static void main(String[] args) {
        int number = 5; // Example number
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    public static void checkEvenOdd(int number) {
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
//    Scanner sc=new Scanner(System.in);
//    int num=sc.nextInt();
//    //int even=
//    void findEven(num);
//    void findOdd(num);
//}
//public static void findEven(int a) {
//
//    if(a%2==0) {
//        System.out.println("Even");
//    }
//
//}
//public static void findOdd(int b) {
//    if(b%2!=0) {
//        System.out.println("Odd");
//    }


}


