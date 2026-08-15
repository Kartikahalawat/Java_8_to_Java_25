package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    public static List<String> sortStudentsByName() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .map(Student::getName)
                .collect(toList());
    }

    public static List<String> sortStudentsByGPA() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .map(Student::getName)
                .collect(toList());
    }

    public static List<String> sortStudentsByGPADesc() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .map(Student::getName)
                .collect(toList());
    }

    public static void main(String[] args) {

        System.out.println("Students sorted by name: ");
        System.out.println(sortStudentsByName());

        System.out.println("Students sorted by GPA: ");
        System.out.println(sortStudentsByGPA());

        System.out.println("Students sorted by GPA desc: ");
        System.out.println(sortStudentsByGPADesc());
    }
}