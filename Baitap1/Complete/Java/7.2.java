public class Main {
    private static boolean isEven(int x) {
        int remainder = x % 2;
        return remainder == 0;
    }
    public static void main(String[] args) {
        System.out.println("All numbers between 0 and 20: even or not");
        for(int i = 0; i < 20; i ++) {
            if (isEven(i))
                System.out.println(i + " even");
            else
                System.out.println(i + " odd");
        }
    }
}