package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p1 = (i) -> i%2==0;
    static Predicate<Integer> p2 = (i) -> i%5==0;

    public static void predicateAnd(){
        System.out.println("Predicate And result is : " + p1.and(p2).test(10)); //predicate Chaining
        System.out.println("Predicate And result is : " + p1.and(p2).test(9));  //predicate Chaining
    }

    public static void predicateOr(){
        System.out.println("Predicate Or result is : " + p1.or(p2).test(10));
        System.out.println("Predicate Or result is : " + p1.or(p2).test(11));
    }

    public static void predicateNegate(){
        System.out.println("Predicate Negate result is : " + p1.or(p2).negate().test(8));
    }

    public static void main(String[] args) {

        System.out.println(p1.test(4));

        predicateAnd();
        predicateOr();
        predicateNegate();

    }
}
