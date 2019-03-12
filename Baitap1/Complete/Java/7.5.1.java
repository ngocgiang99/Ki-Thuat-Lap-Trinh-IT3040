public class Main {
    private static void printMove(String from, String to) {
        System.out.println("Move from " + from + " to " + to);
    }
    
    private static void solveHanoiTower(int n, String from, String to, String spare) {
        if (n == 1) {
            printMove(from, to);
        } else {
            solveHanoiTower(n - 1, from, spare, to);
            solveHanoiTower(1, from, to, spare);
            solveHanoiTower(n - 1, spare, to, from);
        }
    }
    public static void main(String[] args) {
        solveHanoiTower(4, "P1", "P2", "P3");
    }
}