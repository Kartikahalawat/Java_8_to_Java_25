package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    static void main(String[] args) {

        /*prior java 8*/
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); //0 -> o1 == o2
                                         //1 -> o1 > o2
                                         //-1 -> o1 < o2
            }
        };

        System.out.println("Result : "  + comparator.compare(3, 2));

        //Lambda after Java 8
        Comparator<Integer> comparator2 = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result : "  + comparator2.compare(3, 2));

        Comparator<Integer> comparator3 = (a,b) -> a.compareTo(b);
        System.out.println("Result : "  + comparator3.compare(3, 2));
    }
}
