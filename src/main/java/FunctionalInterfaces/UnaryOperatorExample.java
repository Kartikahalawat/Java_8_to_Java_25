package FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator = (s) -> s.concat("Defualt");

    static void main(String[] args) {
        System.out.println("Result is : " + unaryOperator.apply("java8"));
    }
}
