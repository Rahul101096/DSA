package StramApiQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ShortTheListInReverseOrder {
    public static void main(String[] args) {
        List<Integer> list=List.of(4,6,2,7,5,12,3,1);

        List<Integer> reverseSorted=list.stream().sorted().toList().reversed();
        System.out.println(reverseSorted);
        List<Integer> list1=List.of(4,6,2,7,5,12,3,1);

        List<Integer> reverseSorted1=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted1);

    }
}
