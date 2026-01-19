package StramApiQuestions;

import java.util.stream.IntStream;

public class Palindrom {
    public static void main(String[] args) {


        String str = "jalaj";

        Boolean result = IntStream.range(0, str.length() / 2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));

        System.out.println(result);
    }
}
