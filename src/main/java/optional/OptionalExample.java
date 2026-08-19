package optional;

import data.Student;
import data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
        Student student = StudentDataBase.studentSupplier.get();

        if(student!=null){
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();
    }

    static void main(String[] args) {
//        String name = getStudentName();
//        if(name!=null)  System.out.println("Length of the student name: " + name.length());
//
//        else System.out.println("Student name is null");
        Optional<String> stringOptional = getStudentNameOptional();
        if(stringOptional.isPresent()){
            System.out.println("Length of the student name: " + stringOptional.get().length());
        }
        else{
            System.out.println("Student name is empty");
        }
    }
}
