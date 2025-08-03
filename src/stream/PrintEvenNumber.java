package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrintEvenNumber {
    public static void main(String[] args) {
        int[] array = IntStream.iterate(2, n -> n + 2)
                .limit(10)
                .toArray();
        System.out.println(Arrays.toString(array));

        List<Integer> evenNumber = IntStream.rangeClosed(1, 21)
                .filter(n -> n % 2 == 0)
                .boxed()
                .toList();
        System.out.println(evenNumber);

        List<Integer> evenNo = IntStream.range(1, 21)
                .filter(n -> n % 2 == 0)
                .boxed()
                .toList();
        System.out.println(evenNo);
    }
}
