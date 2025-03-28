import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Alice", 28);  // Overwrites previous value

        // Printing Map
        System.out.println("Ages Map: " + ages);

        // Accessing value by key
        System.out.println("Alice's Age: " + ages.get("Alice"));
    }
}
