package numericstreams;

import data.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static int sumOfNumbers(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, Integer::sum);
    }

    public static int sumOfNumbersIntStream(){
        return IntStream.rangeClosed(1,5).sum();
    }

    static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        System.out.println("Sum of Numbers: " + sumOfNumbers(integerList));

        System.out.println("Sum of Numbers using IntStream: " + sumOfNumbersIntStream());
    }
}
