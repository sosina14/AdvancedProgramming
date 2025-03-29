public class Lamda {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Lamda exparation in Java 8");
        Runnable s = () -> System.out.println("Runnable exparation in Java 8");
        new Thread(r).start();
        new Thread(s).start();
    }
}
