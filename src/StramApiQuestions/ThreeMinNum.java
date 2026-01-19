//Find three min num from the list
package StramApiQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMinNum {
    public static void main(String[] args) {
        List<Integer> listOfInteger=List.of(12,13,20,1,6,14,18,0);


        List<Integer> result=listOfInteger.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(result);
    }
}
