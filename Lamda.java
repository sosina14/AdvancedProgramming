public class Lamda {
    public static void main(String[] args) {
        // Using a lambda expression to create a Runnable
        Runnable r = () -> System.out.println("Running...");
        // Using lambda expression to create a thread
        // and start it immediately

        new Thread(r).start();
    }
}
