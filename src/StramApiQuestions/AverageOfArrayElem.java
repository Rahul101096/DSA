package StramApiQuestions;

import java.util.Arrays;

public class AverageOfArrayElem {

    public static void main(String[] args) {
        int[] arr={12,2,6,9,15,14,13};

        double result= Arrays.stream(arr).average().getAsDouble();
        System.out.println(result);
    }
}
