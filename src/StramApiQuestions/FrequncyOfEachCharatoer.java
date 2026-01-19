package StramApiQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequncyOfEachCharatoer {
    public static void main(String[] args) {
        String str="abcdababacdbcce";
        Map<Character, Long> count=str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);
    }
}
