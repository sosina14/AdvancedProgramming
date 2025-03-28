import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        
        // Adding elements
        names.add("Sosina");
        names.add("Redet");
        names.add("Elsa"); 
        names.add("Ribeka");
        // Printing List
        System.out.println("Names List: " + names);

        // Accessing elements by index
        System.out.println("First Element: " + names.get(0));

        // Iterating using for-each loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}
