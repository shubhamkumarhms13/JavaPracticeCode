package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxRepeatedElement {
    public static int mostRepeatedNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return Integer.MAX_VALUE;
        }

        Map<Integer, Long> freqMap = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long maxFreq = freqMap.values().stream().max(Long::compareTo).orElse(0L);

        List<Integer> maxFreqNumbers = freqMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxFreq)
                .map(Map.Entry::getKey)
                .toList();

        return (maxFreqNumbers.size() == 1) ? maxFreqNumbers.getFirst() : Integer.MIN_VALUE;
    }

    public static void printResult(int[] numbers) {
        int result = mostRepeatedNumber(numbers);

        if (result == Integer.MIN_VALUE) {
            System.out.println("No Max value available");
        } else if (result == Integer.MAX_VALUE) {
            System.out.println("No element available");
        } else {
            System.out.println("Max repeated character is " + result);
        }
    }

    public static void main(String[] args) {
        printResult(new int[]{1, 2, 3, 2, 4, 2, 6, 5, 4, 2, 3, 6, 3});
        printResult(new int[]{});
        printResult(new int[]{1, 2, 3, 2, 4, 2, 6, 5, 4, 3, 6, 3});
        printResult(new int[]{-1, -1, -2, -3, -2});
    }
}
