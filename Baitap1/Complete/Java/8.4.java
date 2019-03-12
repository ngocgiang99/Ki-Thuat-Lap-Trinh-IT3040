import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);

        // This code doesn't handle exception and prone to behave unexpectably
        System.out.print("Tell me one number: "); a = scanner.nextDouble();
        System.out.print("Tell me another number: "); b = scanner.nextDouble();
        System.out.println("a / b = " + (a / b));
        System.out.println("a + b = " + (a + b));

        // This code handles exception properly
        try {
            System.out.print("Tell me one number: "); a = scanner.nextDouble();
            System.out.print("Tell me another number: "); b = scanner.nextDouble();
            System.out.println("a / b = " + (a / b));
            System.out.println("a + b = " + (a + b));
        } catch (Exception e) {
            if (e instanceof InputMismatchException)
                System.out.println("Could not convert to a number");
            else if (e instanceof ArithmeticException)
                System.out.println("Can't divide by zero");
            else
                System.out.println("Something went very wrong");
        }

        scanner.close();
    }
}