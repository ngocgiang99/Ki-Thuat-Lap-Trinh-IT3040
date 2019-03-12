public class Main {
    public static double avg(double[] grades) {
        if (grades.length == 0)
            return 0;
        double sum = 0;
        for (double g : grades)
            sum += g;
        return sum / grades.length;
    }
}