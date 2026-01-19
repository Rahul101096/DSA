//Sum of all the elements of array
package StramApiQuestions;

import java.util.Arrays;

public class SumOfArrayElem {
    public static void main(String[] args) {
        int[] arr={1,3,7,0,8,5,6,19};

        int result= Arrays.stream(arr).sum();
        System.out.println(result);
    }
}
