package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static Optional<Integer> findMaxValue(List<Integer> integerList){
        return integerList.stream()
                //x variable holds the max value in each iteration
                .reduce((x,y) ->  x>y?x:y);
    }

    public static Optional<Integer> findMinValue(List<Integer> integerList){
        return integerList.stream()
                //x variable holds the min value in each iteration
                .reduce( (x,y) ->  x>y?y:x);
    }

    static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> maxValue = findMaxValue(integerList);
        if(maxValue.isPresent()){
            System.out.println("Max value is " + maxValue.get());
        }

        Optional<Integer> minValue = findMinValue(integerList);
        if(minValue.isPresent()){
            System.out.println("Min value is " + minValue.get());
        }
    }
}
