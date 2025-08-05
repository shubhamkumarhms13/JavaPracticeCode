package stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaximumRepeatedCharacter {
    public static char frequencyOfChar(String str){
        if(str.isEmpty()){
            return Character.MAX_VALUE;
        }
        Map<Character, Long> collect = str.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long l = collect.values().stream().min(Long::compareTo).orElse(0L);

        List<Character> list = collect.entrySet().stream().filter(x -> x.getValue() == l).map(Map.Entry::getKey).toList();

        if(list.size() == 1){
            return list.getFirst();
        }else {
            return Character.MIN_VALUE;
        }
    }

    public static void printElement(String str){
        str = str.replaceAll("\\s+","");
        char ch = frequencyOfChar(str);

        if(ch == Character.MAX_VALUE){
            System.out.println("String is empty");
        }else if(ch == Character.MIN_VALUE) {
            System.out.println("No minimum element found");
        }else {
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        String str1 = "Hello     World";
        printElement(str1);
        String str2 = "Hel2lo  54ILU 1  Wo345rld";
        printElement(str2);
        String str3 = "c";
        printElement(str3);
        String str4 = "";
        printElement(str4);
    }
}
