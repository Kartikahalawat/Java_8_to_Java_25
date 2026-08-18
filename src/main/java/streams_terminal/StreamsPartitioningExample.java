package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningExample {

    public static void partitioningBy_1(){
        Predicate<Student> gpaPradicate = student -> student.getGpa() >=3.8;

        Map<Boolean, List<Student>> map= StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPradicate));

        System.out.println("Partitioning by GPA : " + map);
    }

    public static void partitioningBy_2(){
        Predicate<Student> gpaPradicate = student -> student.getGpa() >=3.8;

        Map<Boolean, Set<Student>> map= StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPradicate,
                        toSet()));

        System.out.println("Partitioning by GPA : " + map);
    }

    static void main(String[] args) {
        //partitioningBy_1();
        partitioningBy_2();
    }
}
