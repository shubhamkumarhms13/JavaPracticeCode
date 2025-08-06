package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PalindromeStringList {
    public static void main(String[] args) {
        List<String> stringList2 = Arrays.asList("Pap", "banana", "malayalam", "carrot", "level", "radar","", "madam"," ", null);
        Map<String, Boolean> collect1 = stringList2.stream().filter(str -> str != null)
                .map(String::trim)
                .filter(str -> !str.isEmpty())
                .map(String::toLowerCase)
                .collect(Collectors.toMap(
                        str -> str,
                        str -> str.contentEquals(new StringBuilder(str).reverse())
                ));

        System.out.println(collect1);
    }
}
