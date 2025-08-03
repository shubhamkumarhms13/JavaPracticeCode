package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinRepeatedElement {
    public static int maxFrequency(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return Integer.MAX_VALUE;
        }
        Map<Integer, Long> collect = Arrays.stream(numbers).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        Long l = collect.values().stream().min(Long::compareTo).orElse(0L);

        List<Integer> list = collect.entrySet().stream().filter(x -> Objects.equals(x.getValue(), l)).map(Map.Entry::getKey).toList();

        return (list.size() == 1) ? list.getFirst() : Integer.MIN_VALUE;
    }

    public static void printElement(int[] numbers) {
        int result = maxFrequency(numbers);

        if (result == Integer.MAX_VALUE) {
            System.out.println("No element in list");
        } else if (result == Integer.MIN_VALUE) {
            System.out.println("No maximum value");
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        printElement(new int[]{1, 2, 3, 2, 4, 1, 2, 6, 5, 4, 2, 3, 6, 3});
        printElement(new int[]{});
        printElement(new int[]{1, 2, 3, 2, 4, 2, 6, 5, 4, 3, 6, 3});
        printElement(new int[]{-1, -1, -2, -3, -2});
    }
}
