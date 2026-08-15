package streams;

import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatExample {

    public static List<String> printStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map((student) -> student.getActivities())
                .flatMap(List::stream)// Stream<String> (it will take each and every element (even repeated elements) of stream)
                .distinct() //Doesn't allow duplicates
                .sorted()
                .collect(toList());

        return  studentActivities;
    }

    public static long getStudentActivitiesCount(){
        long noOfStudentActivities = StudentDataBase.getAllStudents().stream()
                .map((student) -> student.getActivities())
                .flatMap(List::stream)// Stream<String> (it will take each and every element (even repeated elements) of stream)
                .distinct() //Doesn't allow duplicates
                .count();

        return  noOfStudentActivities;
    }

    static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());
    }
}
