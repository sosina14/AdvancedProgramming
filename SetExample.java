import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        
        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);  // Duplicate (ignored)

      
        System.out.println("Numbers Set: " + numbers);
    }
}
