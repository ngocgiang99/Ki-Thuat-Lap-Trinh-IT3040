import java.util.Arrays;
//import java.util.Scanner;

public class MergeSort {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++)
            arr[i] = scanner.nextInt();
        
        int[] result = sort(arr);
        for(int x : result)
            System.out.print(x + " ");
        scanner.close();
    }*/

    public static int[] merge(int[] left, int[] right) {
        // Corner cases: either left or right equals null
        if (left == null)
            return right;
        if (right == null)
            return left;

        int[] result = new int[left.length + right.length];
        int idLeft = 0, idRight = 0;
        for(int i = 0; i < result.length; i ++) {
            if (idLeft == left.length)
                result[i] = right[idRight ++];
            else if (idRight == right.length)
                result[i] = left[idLeft ++];
            else {
                if (left[idLeft] < right[idRight])
                    result[i] = left[idLeft ++];
                else
                    result[i] = right[idRight ++];
            }
        }

        return result;
    }

    public int[] sort(int[] arr) {
        // Corner cases: Either array equals to null, or the array has length less than or equal to 1
        if (arr == null || arr.length <= 1)
            return arr;
        int middle = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, middle));
        int[] right = sort(Arrays.copyOfRange(arr, middle, arr.length));
        int[] result = merge(left, right);
        return result;
    }
}