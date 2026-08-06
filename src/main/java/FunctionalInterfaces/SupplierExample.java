package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    static void main(String[] args) {
        Supplier<Student> studentSupplier = ()->{
            return new Student("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"));
        };

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Student is : " + studentSupplier.get());
        System.out.println("Student are : " + listSupplier.get());
    }
}
