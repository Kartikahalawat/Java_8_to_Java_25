package parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier, int noOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<noOfTimes;i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1, 10000)
                .sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(1, 10000)
                .parallel()
                .sum();
    }

    static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("Sequential Stream Result:"
                + checkPerformanceResult(ParallelStreamExample::sumSequentialStream,20));
        System.out.println("Parallel Stream Result:"
                + checkPerformanceResult(ParallelStreamExample::sumParallelStream,20));
    }

    /*
    Small datasets: The overhead of managing threads and splitting tasks takes longer than the actual processing.
    Shared mutable state: Modifying external variables causes data corruption, race conditions, and thread safety issues.
    Blocking I/O operations: Heavy network, database, or file tasks block and starve the shared ForkJoinPool.
    Poorly-splittable structures: Collections like LinkedList require linear traversal to split, destroying parallel performance.
    Order-dependent methods: Operations like .limit(), .skip(), and .findFirst() require heavy thread coordination to maintain sequence.
    Costly result merging: Complex reduction steps, like merging large maps, can easily wipe out parallel speed gains.Low N×Q workload: When total items multiplied by CPU work per item is under 10,000, sequential execution is faster.
     */
}
