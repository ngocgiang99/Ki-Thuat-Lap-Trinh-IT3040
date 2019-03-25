import java.util.ArrayList;
import java.util.Scanner;

class MergeSort{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("input a list:");
        int[] arr = new int[100];
        int n = scan.nextInt();
        for(int i = 0 ; i < n ; i++){
            arr[i] = scan.nextInt();
        }

        if(n==0) return;
        
        merge_sort(arr, 0, n-1);
        
        System.out.println("sorted list:");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge_sort(int[] arr , int left , int right){
        if(left == right) return;
        
        int mid = (right + left)/2;
        merge_sort(arr, left, mid);
        merge_sort(arr, mid + 1, right);
        
        merge(arr , left , mid , right);
        return;
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int idxL = left; 
        int idxR = mid + 1;
        
        int[] newarr = new int[100];
        int idx = 0;

        while(idxL <= mid && idxR <= right){
            if(arr[idxL] < arr[idxR]){
                newarr[idx++] = arr[idxL++];
            }
            else{
                newarr[idx++] = arr[idxR++];
            }
        }

        while(idxL <= mid){
            newarr[idx++] = arr[idxL++];
        }
        
        while(idxR <= right){
            newarr[idx++] = arr[idxR++];
        }

        idx=0;
        while(left<=right){
            arr[left++] = newarr[idx++];
        }

        return;
    }
}