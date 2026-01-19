//Merge two unsorted array in to single sorted array
package StramApiQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1={26,3,8,6,1,2,7};
        int[] arr2={4,9,15,11,16,13};

        int[] result= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(result));
    }
}
