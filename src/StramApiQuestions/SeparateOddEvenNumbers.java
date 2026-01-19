package StramApiQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddEvenNumbers {
    public static void main(String[] args) {
        List<Integer> listOfInteger=List.of(11,9,12,4,7,6,3,8,14);
       Map<Boolean, List<Integer>> oddEvenList=listOfInteger.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(oddEvenList);

    }
}
