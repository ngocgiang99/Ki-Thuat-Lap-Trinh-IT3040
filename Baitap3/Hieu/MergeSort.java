import java.io.File;
import java.util.Arrays;
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
        
        sort(arr);
        scanner.close();
    }

    public static void sort(int[] arr) {
        if (arr == null)
            return;
        _sort(arr, 0, arr.length);
    }

    private static void _sort(int[] arr, int from, int to) {
        int length = to - from;
        if (length <= 1)
            return;
        int middle = from + length / 2;
        _sort(arr, from, middle);
        _sort(arr, middle, to);
        merge(arr, from, middle, to);
    }

    public static void merge(int[] arr, int from, int middle, int to) {
        int[] left = Arrays.copyOfRange(arr, from, middle);
        int[] right = Arrays.copyOfRange(arr, middle, to);
        int idLeft = 0, idRight = 0, iterPos = from;
        while(idLeft < left.length && idRight < right.length) {
            if (left[idLeft] < right[idRight])
                arr[iterPos ++] = left[idLeft ++];
            else
                arr[iterPos ++] = right[idRight ++];
        }
        while(idLeft < left.length)
            arr[iterPos ++] = left[idLeft ++];
        while(idRight < right.length)
            arr[iterPos ++] = right[idRight ++];
    }
}