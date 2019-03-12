import java.util.ArrayList;
import java.util.List;

public class Main {
    static class Student {
        public String[] name;
        public double[] scores;

        public Student(String[] name, double[] scores) {
            this.name = name;
            this.scores = scores;
        }
    }

    static class StudentStatus {
        public Student student;
        public double averageScore;
    }

    private static List<StudentStatus> getStatus(Student[] students) {
        List<StudentStatus> newStatus = new ArrayList<>();
        for(Student s : students) {
            StudentStatus sStatus = new StudentStatus();
            sStatus.student = s;
            sStatus.averageScore = getAverageScore(s);
            newStatus.add(sStatus);
        }
        return newStatus;
    }

    private static double getAverageScore(Student student) {
        assert student.scores != null: "Warning: no grades data";
        assert student.scores.length != 0: "Warning: no grades data";
        return getSumScore(student) / student.scores.length;
    }

    private static double getSumScore(Student student) {
        double sum = 0;
        for(double score : student.scores)
            sum += score;
        return sum;
    }

    public static void main(String[] args) {
        Student[] testGrades = new Student[] {
            new Student(new String[] {"Peter", "Parker"}, new double[] {80.0, 70.0, 85.0}),
            new Student(new String[] {"Bruce", "Wayne"}, new double[] {80.0, 70.0, 85.0}),
            new Student(new String[] {"Captain", "America"}, new double[] {80.0, 70.0, 85.0}),
            new Student(new String[] {"Deadpool"}, null),
        };
        getStatus(testGrades);
    }
}