package defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClietn {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Result is : " + multiplier.multiply(integerList));
        System.out.println("default method size is : " + multiplier.size(integerList));

        //static methods of interface can be use by using a class
        System.out.println("static method isEmpty is : " + Multiplier.isEmpty(integerList));
    }
}
