package optional;

import data.Student;

import java.util.Optional;

public class OptionalPresentExample {
    static void main(String[] args) {
        //isPresent
        Optional<String> optional = Optional.ofNullable("hello optional");
        System.out.println(optional.isPresent());
        if(optional.isPresent()){
            System.out.println(optional.get());
        }

        //ifPresent
        optional.ifPresent(System.out::println);
    }
    /*
    isPresent() acts as a simple conditional check that returns true if a value is inside the Optional and false if it is empty. Because it only returns a boolean, it is typically used inside traditional if statements and requires a subsequent call to .get() to actually retrieve and use the underlying value. This approach follows a traditional, imperative programming style.
     */

    /*
    ifPresent(), on the other hand, is a functional approach that takes a consumer action (like a lambda expression) and automatically executes it only if the value exists. It does not return any value (void) and eliminates the need to call .get() manually, as the value is passed directly into your code block. This approach results in cleaner, more concise code by combining the presence check and the action into a single step.
     */
}
