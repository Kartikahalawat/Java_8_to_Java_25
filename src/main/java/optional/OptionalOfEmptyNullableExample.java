package optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){
        Optional<String> stringOptional = Optional.ofNullable(null);
        return stringOptional;
    }

    public static Optional<String> of(){
        Optional<String> stringOptional = Optional.of("Hello"); //can't pass null
        return stringOptional;
    }

    public static Optional<String> empty(){
        return Optional.empty();
    }

    static void main(String[] args) {
        System.out.println("OfNullable : " + ofNullable().isPresent());
        System.out.println("Of : " + of().isPresent());
        System.out.println("Empty : " + empty().isPresent());
    }
}
