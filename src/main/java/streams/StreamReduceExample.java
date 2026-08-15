package streams;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {


    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                //1
                //3
                //5
                //7
                //a=1,b=1(from stream) => result 1 is returned
                //a=1,b=3 => 3
                //a=3,b=5 => 15
                //a=15,b=7 => 105
                .reduce(1, (a,b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) -> a*b);
    }

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> (s1.getGpa()>s2.getGpa()) ? s1 : s2);
    }


    static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        List<Integer> integers2 = new ArrayList<>();

        System.out.println(performMultiplication(integers));

        Optional<Integer> result =  performMultiplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        Optional<Integer> resutl1 = performMultiplicationWithoutIdentity(integers2);
        System.out.println(resutl1.isPresent());

        if(resutl1.isPresent()){
            System.out.println(resutl1.get());
        }

        Optional<Student> studentOptional = getHighestGPAStudent();
        if(getHighestGPAStudent().isPresent()){
            System.out.println(studentOptional.get());
        }
    }
}
