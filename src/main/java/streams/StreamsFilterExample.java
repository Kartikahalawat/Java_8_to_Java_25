package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {

    public static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGpa()>=3.9)
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("Filtering Students : " + filterStudents());

    }
}
