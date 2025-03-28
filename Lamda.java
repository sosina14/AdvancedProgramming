public class Lamda {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Running...");
        new Thread(r).start();
    }
}
