package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    // filter
    public static void optionalFilter() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional.filter(student -> student.getGpa() >= 3.5)
                .ifPresent(student -> System.out.println(student.getName()));
    }

    // map
    public static void optionalMap() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()) {
            Optional<String> stringOp = studentOptional
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);

            System.out.println(stringOp.get());
        }
    }

    // flatMap
    public static void optionalFlatMap() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<String> nameOptional = studentOptional
                .filter(student -> student.getGpa() >= 3.5)
                .flatMap(student -> Optional.ofNullable(student.getName()));

        nameOptional.ifPresent(System.out::println);
    }

    static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}

/*
 * REVISION NOTES:
 *
 * 1. filter()
 *    - Used to check a condition.
 *    - If condition is true -> Optional remains present.
 *    - If false -> returns Optional.empty().
 *
 * 2. map()
 *    - Used to transform the value inside Optional.
 *    - Example: Optional<Student> -> Optional<String>
 *    - map() automatically wraps the result in Optional.
 *
 * 3. flatMap()
 *    - Used when the mapping function already returns an Optional.
 *    - Prevents nested Optional<Optional<T>>.
 *    - Example:
 *        Optional<Student>
 *             -> flatMap()
 *             -> Optional<String>
 *
 * Quick difference:
 *
 * map    : T -> R
 *         Optional<T> -> Optional<R>
 *
 * flatMap: T -> Optional<R>
 *         Optional<T> -> Optional<R>
 */