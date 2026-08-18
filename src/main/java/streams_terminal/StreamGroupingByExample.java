package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {

    public static void customizedGroupingBy(){
        Map<String, List<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student->student.getGpa()>=3.8 ? "Outstanding" : "Average"));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa()>=3.8 ? "Outstanding" : "Average")));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2(){
        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNotebooks)));
        System.out.println(studentMap);
    }

    public static void threeArgumentGroupBy(){
        LinkedHashMap<String, Set<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new,toSet()));
        System.out.println(studentMap);
    }

    public static void calculateTopGpa(){
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(studentMapOptional);
    }

    static void main(String[] args) {
        //  customizedGroupingBy();
       // twoLevelGrouping_1();
        //twoLevelGrouping_2();
        //threeArgumentGroupBy();
        calculateTopGpa();

    }
}
