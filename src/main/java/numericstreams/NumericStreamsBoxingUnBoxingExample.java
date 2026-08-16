package numericstreams;

import javax.swing.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.rangeClosed;

public class NumericStreamsBoxingUnBoxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                //int
                .boxed()
                //integer
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> list){
        //wrapper to primitive
        return list.stream()
                //Wrapper Integer Values
                .mapToInt(Integer::intValue)//intstream(intValue of the Wrapper Class)
                .sum();
    }

    static void main(String[] args) {
        System.out.println("Boxing : " + boxing());

        List<Integer> integerList = boxing();
        System.out.println("Unboxing : " + unboxing(integerList));
    }
}
