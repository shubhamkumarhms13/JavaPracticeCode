package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectValueBasedOnFirstCharacter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "apricort", "carrot", "cart", "buffallo", "bucket");
        Map<Character, List<String>> collect = stringList.stream().collect(Collectors.groupingBy(str -> str.charAt(0)));
        System.out.println(collect);
    }
}
