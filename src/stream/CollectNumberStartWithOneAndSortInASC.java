package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CollectNumberStartWithOneAndSortInASC {
    public static void main(String[] args) {
        //With Collections
        List<Integer> numbers = Arrays.asList(12, 21, 32, 1, 41, 14, 15, 1, 16, 19, 21, 13, null);
        List<Integer> list = numbers.stream()
                .filter(Objects::nonNull)
                .filter(s -> String.valueOf(s).startsWith("1"))
                .distinct()
                .sorted().toList();
        System.out.println(list);

        //Without Collections
        int[] nums = {12, 21, 1, 32, 41, 14, 15, 1, 16, 19, 21, 13};
        List<Integer> list1 = Arrays.stream(nums)
                .boxed()
                .filter(x -> String.valueOf(x).startsWith("1"))
                .distinct()
                .sorted()
                .toList();
        System.out.println(list1);
    }
}
