package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectValueBasedOnFirstCharacter {
    public static void main(String[] args) {
        List<String> stringList1 = Arrays.asList("apple", "banana", "apricot", "carrot", "cart", "buffalo","", "bucket"," ", null);
        Map<Character, List<String>> collect = stringList1.stream()
                .filter(str -> str != null)
                .map(String::trim)
                .filter(str -> !str.isEmpty())
                .collect(Collectors.groupingBy(str -> str.charAt(0)));
        System.out.println(collect);
    }
}
