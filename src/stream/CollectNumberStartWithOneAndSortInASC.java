package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CollectNumberStartWithOneAndSortInASC {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,21,32,41,14,15,1,16,19,21,13,null);
        List<Integer> list = numbers.stream().filter(Objects::nonNull).filter(s -> String.valueOf(s).startsWith("1")).sorted().toList();
        System.out.println(list);
    }
}
