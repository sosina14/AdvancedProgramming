import calculator.Calculator;
import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        calculator.Calculator calc = new Calculator();  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator program!");
        System.out.println("Enter the first number ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number ");
        int b = scanner.nextInt();
        System.out.println("Enter the operation you want to perform: add, subtract, multiply, divide");
        
        String operation = scanner.next();
        int result = 0;

        switch (operation) {
            case "add":
                result = calc.add(a, b);
                break;
            case "subtract":
                result = calc.subtract(a, b);
                break;
            case "multiply":
                result = calc.multiply(a, b);
                break;
            case "divide":
                try {
                    result = calc.divide(a, b);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;  // Exit if division by zero is attempted
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter add, subtract, multiply, or divide.");
                return;  // Exit if the operation is invalid
        }
        System.out.println("The result of " + operation + "ing " + a + " and " + b + " is: " + result);
        scanner.close();  
    }
    
}
