/* 
import java.util.*;

public class Lamda2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 4, 7, 6, 3);
        
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a; // Descending Order
            }
        });
        
        System.out.println(numbers);
    }
}
 */

 import java.util.*;

public class Lamda2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 4, 7, 6, 9);

        // Sorting in descending order using Lambda
        numbers.sort((a, b) -> b - a);

        System.out.println(numbers);
    }
}
