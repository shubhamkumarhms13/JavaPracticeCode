package stream;

import java.util.Arrays;
import java.util.List;

public class CollectNumEndWithOneAndSortInASC {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(25, 41, 23, 11, 21, 55, 31, 11, 44, 33, 21, 1, null);
        List<Integer> list = numbers.stream()
                .filter(x -> x != null)
                .filter(n -> n % 10 == 1)
                .distinct().sorted()
                .toList();
        System.out.println(list);

        int[] nums = {25, 41, 23, 21, 55, 31, 11, 44, 33, 21, 1};
        List<Integer> list1 = Arrays.stream(nums)
                .boxed()
                .filter(x -> x % 10 == 1)
                .distinct()
                .sorted()
                .toList();
        System.out.println(list1);
    }
}
