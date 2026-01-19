//Find the 3 max num from the list
package StramApiQuestions;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMaxNum {
    public static void main(String[] args) {
        List<Integer> listOfInteger=new ArrayList<>();
        listOfInteger=List.of(10,13,8,19,25,23,13,18);

        List<Integer> result = listOfInteger.stream()
                .sorted(Comparator.reverseOrder()) // Sorts in descending order
                .limit(3)                          // Limits the stream to the first 3 elements
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
