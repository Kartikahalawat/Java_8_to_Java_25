package defaults;

import java.util.*;

public class DefualtMethodExample {
    public static void main(String[] args) {
        /*
        Sort the list of names in alphabetical order
         */
        List<String> stringList = Arrays.asList("Adams", "Jenny", "Alex", "Dan", "Eric", "Zyan");

        /*
        Prior Java 8
         */
//        Collections.sort(stringList);
//        System.out.println("Sorted using Collections.sort(): " + stringList);


        /*
        Java 8 beyond
         */
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted List using List.sort(): " + stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted List using Comparator.reverseOrder(): " + stringList);
    }
}
