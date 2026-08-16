package numericstreams;

import java.util.stream.IntStream;

public class NumericStreamsRangeExample {
    static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println(intStream.count());

        IntStream.range(1,50).forEach((value -> System.out.print(value + ",")));

        System.out.println();
        System.out.println();

        System.out.println("Now Range closed method");
        IntStream intStreams = IntStream.rangeClosed(1,50);
        System.out.println(intStreams.count());

        IntStream.rangeClosed(1,50).forEach((value -> System.out.print(value + ",")));
    }
}
