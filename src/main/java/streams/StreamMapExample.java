package streams;

import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {

    public static Set<String> namesSet(){
        Set<String> studentList = StudentDataBase.getAllStudents().stream()
                .map((student) -> student.getName())
                .map(String::toUpperCase)
                .collect(toSet());

        return studentList;
    }

    static void main(String[] args) {
        System.out.println(namesSet());
    }
}
