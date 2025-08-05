package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectValueBasedOnFirstCharacter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "ban2ana", "apricort", "carrot", "ca4rt", "buffallo", "bucket","");
        Map<Character, List<String>> collect = stringList.stream()
                .filter(str -> str != null && !str.isEmpty())
                .map(String::trim)
//                .filter(str -> str.matches("[a-zA-Z]+"))
                .collect(Collectors.groupingBy(str -> str.charAt(0)));
        System.out.println(collect);
    }
}
