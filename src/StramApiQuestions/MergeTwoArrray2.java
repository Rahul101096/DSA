//Merge two unsorred arrya in to singled sorted array without dublicates
package StramApiQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrray2 {
    public static void main(String[] args) {
        int[] arr1={26,3,4,6,1,2,7};
        int[] arr2={4,2,3,4,2,26,6};

        int[] result= IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray();

        System.out.println(Arrays.toString(result));
    }
}
