package stream;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NaturalNumberSum {
    public static int sumWithoutStream(int n) {
        return (n * (n + 1) / 2);
    }

    public static int sumWithStream(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }

    public static int readValidNaturalNumber(Scanner sc) {
        int n = 0;
        while (true) {
            System.out.print("Enter a natural number: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Number should be greater than 0!");
                }
            } else {
                System.out.println("Given input is not an integer");
                sc.next();
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = readValidNaturalNumber(sc);
        System.out.println("Sum of " + n + " natural number is " + sumWithoutStream(n));
        System.out.println("Sum of " + n + " natural number is " + sumWithStream(n));
    }
}
