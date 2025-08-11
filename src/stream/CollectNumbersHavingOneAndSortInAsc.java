package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CollectNumbersHavingOneAndSortInAsc {
    public static void main(String[] args) {
        //Using collection
        List<Integer> numbers = Arrays.asList(11, 22, 4, 14, 6, 45, 1, -15, 10, 21, 16, 1, 31, 71, 0, null, 61);
        List<Integer> list1 = numbers.stream()
                .filter(Objects::nonNull)
                .filter(num -> String.valueOf(num).contains("1"))
                .distinct()
                .sorted()
                .toList();
        System.out.println(list1);

        //Without Collection
        int[] nums = {11, 22, 4, 14, 6, 45, 1, -15, 10, 21, 16, 31, 71, 0, 61};
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .filter(num -> String.valueOf(num).contains("1"))
                .distinct()
                .sorted()
                .toList();
        System.out.println(list);
    }
}
