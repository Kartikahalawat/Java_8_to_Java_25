package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integerList){
        return integerList.stream()
                .limit(3)
                .reduce((x,y) -> x+y);
    }

    public static Optional<Integer> skip(List<Integer> integerList){
        return integerList.stream()
                .skip(3)
                .reduce((x,y) -> x+y);
    }

    static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> limitResult =  limit(integers);
        if(limitResult.isPresent()){
            System.out.println("Limit result is " + limitResult.get());
        }

        Optional<Integer> skipResult = skip(integers);
        if (skipResult.isPresent()){
            System.out.println("Skip result is " + skipResult.get());
        }
    }
}
