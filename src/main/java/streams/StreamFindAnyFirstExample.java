package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=4.0)
                .findFirst();
    }

    static void main(String[] args) {
        Optional<Student> studentFindAny = findAnyStudent();
        if(studentFindAny.isPresent()){
            System.out.println("Found the student : " +  studentFindAny.get());
        }
        else{
            System.out.println("No student found");
        }

        Optional<Student> studentFindFirst = findFirstStudent();
        if(studentFindFirst.isPresent()){
            System.out.println("Found the student : " +  studentFindFirst.get());
        }
        else {
            System.out.println("No student found");
        }
    }
}
