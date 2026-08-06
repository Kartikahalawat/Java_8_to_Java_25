package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefractorMethodReferenceExample {

    static Predicate<Student> p1 = RefractorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student student){
        return student.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
