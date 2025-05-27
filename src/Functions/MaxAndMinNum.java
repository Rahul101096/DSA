//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package Functions;

public class MaxAndMinNum {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};
        int max = findMax(numbers);
        int min = findMin(numbers);
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger number is found
            }
        }
        return max;
    }
    public static int findMin(int[] arr) {
        int min = arr[0]; // Assume the first element is the minimum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller number is found
            }
        }
        return min;
    }
    // The findMax and findMin methods can be reused in other parts of the program Scanner sc=new Scanner(System.in);
    //       int num1=sc.nextInt();
    //       int num2=sc.nextInt();
    //       int num3=sc.nextInt();
    //      // int maxNumber=
    //      maxNum(num1, num2, num3);
    //       //int minNumber=
    //       minNum(num1, num2, num3);
    //
    //
    //}
    //  public static void maxNum(int a, int b, int c) {
    //           if(a>b && a>c) {
    //               System.out.println(a+" is maxnum ");
    //           } else if(b>a && b>c) {
    //              System.out.println(b+" is maxnum");
    //              //minNum(a,b,c);
    //           } else {
    //               System.out.println(c+" is maxnum");
    //           }
    //       }
    //       public static void minNum(int a, int b, int c) {
    //           if(b<a && b<c) {
    //               System.out.println(b+"is minNum");
    //           } else if(a<b && a<c) {
    //               System.out.println(a+" is minNum");
    //           } else {
    //               System.out.println(c+" is minNum");
    //           }
    //       }
}
