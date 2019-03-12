import java.lang.Math;

public class Main {
    private static double calculateCube(double x) {
        return x * x * x;
    }

    private static double bisectionnCuberootApprox(double x, double epsilon) {
        double low = Math.min(x, 0);
        double high = Math.max(x, 0);
        double guess = (low + high) / 2;

        while(Math.abs(calculateCube((guess)) - x) >= epsilon) {
            if (calculateCube(guess) < x)
                low = guess;
            else
                high = guess;
            guess = (low + high) / 2;
        }

        return guess;
    }
    public static void main(String[] args) {
        double x = 1;
        while(x <= 10000) {
            double approx = bisectionnCuberootApprox(x, 0.01);
            System.out.println(approx + " is close to cube root of " + x);
            x *= 10;
        }
    }
}