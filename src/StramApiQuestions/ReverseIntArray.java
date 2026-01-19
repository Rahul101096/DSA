//Reverse an integer array
package StramApiQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseIntArray {

    public static void main(String[] args) {
        int[] arr={4,5,2,8,6,12,6,9,11};

        int[] result= IntStream.rangeClosed(1, arr.length).map(i->arr[arr.length-i]).toArray();

        System.out.println(Arrays.toString(result));
    }
}
