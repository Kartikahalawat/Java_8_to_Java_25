package streams_terminal;

import data.Student;
import data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumExample {

    public static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNotebooks));
    }

    public static double average(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNotebooks));
    }

    static void main(String[] args) {
        System.out.println("Total no of books: " + sum());
        System.out.println("Average notebooks: " + average());
    }
}
