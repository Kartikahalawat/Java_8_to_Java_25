package methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String, String> toUpperCaseLambda = (s)-> s.toUpperCase();
    static Function<String, String> toUpperMethodReference = String::toUpperCase;

    static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("Jenny"));
        System.out.println(toUpperMethodReference.apply("Emily"));
    }
}
