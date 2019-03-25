import java.io.File;
import java.util.Scanner;

class Test{
    public static void main(String[] args) throws Exception {
        Scanner scan;
        File file;
        int n;
        MergeSort Sort = new MergeSort();
        while(true){
            System.out.println("1 : test sort \n 2 : test merge");
            scan  = new Scanner(System.in);
            int instance = scan.nextInt();
            if(instance == 1){
                file = new File("sort_test.txt");
                scan = new Scanner(file);
                while(scan.hasNextInt()){
                    n = scan.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Initial Array:");
                    for(int i = 0; i < n; i ++){
                        arr[i] = scan.nextInt();
                        System.out.print(arr[i] + "  ");
                    }
                    int[] result = Sort.sort(arr);
                    System.out.println("\n Sorted Array:");
                    for(int x : result)
                    System.out.print(x + "  "); 
                    System.out.println("\n");
                }
            }
            else{
                file = new File("structure_test.txt");
                scan = new Scanner(file);
                while(scan.hasNextInt()){
                    n = scan.nextInt();
                    int[] arr1 = new int[n];
                    int[] arr2 = new int[n];
                    System.out.println("\n array 1 : ");
                    for(int i = 0 ; i < n ; i++){
                        arr1[i] = scan.nextInt();
                        System.out.print(arr1[i] + "  ");
                    }
                    System.out.println("\n array 2 : ");
                    for(int i = 0 ; i < n ; i++){
                        arr2[i] = scan.nextInt();
                        System.out.print(arr2[i] + "  ");
                    }
                    int[] result = Sort.merge(arr1 , arr2);
                    System.out.println("\n Merged Array:");
                    for(int x : result)
                    System.out.print(x + " "); 
                    System.out.println("\n"); 
                }
            }
        }
    }
}