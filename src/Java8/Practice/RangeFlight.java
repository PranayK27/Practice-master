package Java8.Practice;

import java.util.stream.IntStream;

public class RangeFlight {
    public static void main(String[] args) {

        System.out.println("IntStream.range(1, 10)");

        IntStream rangeStream = IntStream.range(1, 10);

        /* range(1, 10) means 1 to 9*/

        rangeStream.forEach(System.out::print);

        System.out.println();

        System.out.println("IntStream.rangeClosed(1, 10)");

        IntStream rangeClosedStream = IntStream.rangeClosed(1, 10);

        /* rangeClosed(1, 10) means 1 to 10 */

        rangeClosedStream.forEach(System.out::print);

        System.out.println();

        System.out.println("Iterate: ");

        IntStream.iterate(0, n -> n+2).limit(10).forEach(System.out::print);

        System.out.println();

        System.out.println("Range: ");

        IntStream.range(8, 56).average().ifPresent(System.out::print);

        System.out.println();

        int maxval = IntStream.range(1, 5).max().getAsInt();

        System.out.println("Max Value: ");

        System.out.println(maxval);

        int minval = IntStream.range(1, 5).min().getAsInt();

        System.out.println("Min Value: ");

        System.out.println(minval);

        int sum = IntStream.range(1, 5).sum();

        System.out.println("Sum of Values: ");

        System.out.println(sum);

    }
}
