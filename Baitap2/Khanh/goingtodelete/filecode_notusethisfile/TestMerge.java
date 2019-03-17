import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class TestMerge{
    public static void main(String[] args) throws FileNotFoundException {
        
        MergeSort sort = new MergeSort();
        int[] array = new int[100];
        int select;
        Scanner scan = new Scanner(System.in);
        System.out.println("Select: \n 0: test merge\n 1:test sort");
        select = scan.nextInt();
        File file1 = new File("structure_test.txt");
        File file2 = new File("sort_test.txt");
        if(select == 0){
            scan = new Scanner(file1);
            while(scan.hasNextInt()){
                try {
                    int n = scan.nextInt();
                    System.out.println("\nInitial Array:");
                    for(int i = 0 ; i < n ; i++){
                        array[i] = scan.nextInt();
                        System.out.print(array[i] + "  ");
                    }
                    sort.Merge(array, 0, n/2 - 1, n-1);
                    System.out.println("\nArray after merging:");
                    for(int i = 0 ; i < n ; i++){
                        System.out.print(array[i] + "  ");
                    }
                    System.out.println("\n \n");
                } catch (Exception e) {
                    e.getStackTrace();
                    //TODO: handle exception
                }
            }
        }
        else{
            scan = new Scanner(file2);
            while(scan.hasNextInt()){
                try {
                    int n = scan.nextInt();
                    System.out.println("\nInitial Array:");
                    for(int i = 0 ; i < n ; i++){
                        array[i] = scan.nextInt();
                        System.out.print(array[i] + "  ");
                    }
                    sort.MergeSort(array, 0, n-1);
                    System.out.println("\nArray after merging:");
                    for(int i = 0 ; i < n ; i++){
                        System.out.print(array[i] + "  ");
                    }
                    System.out.println("\n \n");
                } catch (Exception e) {
                    e.getStackTrace();
                    //TODO: handle exception
                }
            }
        }
    }    
}