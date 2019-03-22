import java.io.*;
import java.util.Scanner;

public class BlackBox {

    public static void main(String[] args) throws FileNotFoundException{

        Scanner scan = new Scanner(System.in);
        while(true) {
            int n = printListTest();
            System.out.println("Ban muon test truong hop may (1-" + Integer.toString(n) + "): ");
            int id = scan.nextInt();
            process(id, n);

            System.out.println("Ban co muon tiep tuc khong (Y/N): ");
            String answer = scan.next();
            if (answer == "N") break;
        }
        scan.close();
    }

    static int printListTest() throws FileNotFoundException{
        for(int i = 1; i < 1000; ++i)
            System.out.println();
        int cnt = 1;
        while(true) {
            String filename = "test" + Integer.toString(cnt) + ".inp";
            File file = new File("Test/" + filename);
            if (file.exists()) {
                Scanner scan = new Scanner(file);
                System.out.println(filename);
                try {
                    while(scan.hasNext()) {
                        String x = scan.next();
                        System.out.print(x + " ");
                    }
                    System.out.println();
                    scan.close();
                }
                catch(Exception e) {
                    System.out.println("arr is not a list of int!");
                }
                
            }
            else break;
            ++cnt;
        }

        return cnt;
    }

    static void process(int id, int n) throws FileNotFoundException {
        if (id > n) {
            System.out.print("Ban nhap khong dung, moi nhap lai...");
            for(int i = 0; i < 3000; ++i);
            return;
        }
        else {
            String filename = "test" + Integer.toString(id) + ".inp";
            File file = new File("Test/" + filename);
            if (file.exists()) {
                Scanner scan = new Scanner(file);
                int m = 0;
                int[] a = new int[100];
                try{
                    while(scan.hasNext()) {
                        int x = scan.nextInt();
                        a[m++] = x;
                    }
                }
                catch (Exception e) {
                    System.out.println("arr is not a list of int!");
                }
                //for(int i = 0; i < m; ++i)
                //    System.out.print(a[i] + " ");

                MergeSort mergesort = new MergeSort();

                a = mergesort.sort(a);
                for(int i = 0; i < m; ++i)
                    System.out.print(a[i] + " ");
                System.out.println();
                scan.close();
            }
        }
    }   
}
