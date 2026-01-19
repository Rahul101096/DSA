//Sort list of string in increasing order of their length
package StramApiQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args) {
        List<String> listofString= List.of("Anuradha", "Rahul", "Ram", "Manjeet", "Amresh");

        List<String> result=listofString.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(result);
    }
}
