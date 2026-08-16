package numericstreams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,50)
                .mapToObj((i) ->{
                    return new Integer(i);
                })
                .collect(toList());
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,50)
                .mapToLong((i)-> i)
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,50)
                .mapToDouble((i)-> i)
                .sum();
    }

    static void main(String[] args) {
        System.out.println("MapToObj: " +  mapToObj());
        System.out.println("MapToLong: " +  mapToLong());
        System.out.println("MapToDouble: " +  mapToDouble());
    }
}
