import java.io.File;
import java.time.Instant;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        File inputFile = new File("test.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(inputFile);    
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++)
            arr[i] = scanner.nextInt();
        
        long startTime = Instant.now().toEpochMilli();
        sort(arr);
        long endTime = Instant.now().toEpochMilli();
        long runTime = endTime - startTime;
        System.out.println(runTime);
        scanner.close();
    }

    private static int[] cache;

    public static void sort(int[] arr) {
        if (arr == null)
            return;
        cache = new int[arr.length];
        sortRecursive(arr, 0, arr.length);
    }

    private static void sortRecursive(int[] arr, int from, int to) {
        int length = to - from;
        if (length <= 1)
            return;
        int middle = from + (length >> 1);
        sortRecursive(arr, from, middle);
        sortRecursive(arr, middle, to);
        merge(arr, from, middle, to);
    }

    public static void merge(int[] arr, int from, int middle, int to) {
        for(int i = from; i < to; i ++)
            cache[i] = arr[i];
        int idLeft = from, idRight = middle, iterPos = from;
        while(idLeft < middle && idRight < to) {
            if (cache[idLeft] < cache[idRight])
                arr[iterPos ++] = cache[idLeft ++];
            else
                arr[iterPos ++] = cache[idRight ++];
        }
        while(idLeft < middle)
            arr[iterPos ++] = cache[idLeft ++];
        while(idRight < to)
            arr[iterPos ++] = cache[idRight ++];
    }
}