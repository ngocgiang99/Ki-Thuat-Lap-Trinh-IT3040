import java.util.ArrayList;
import java.util.Scanner;

class MergeSort{
    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        Scanner scan = new Scanner(System.in);
        int[] array = new int[100];
        int n = scan.nextInt();
        for(int i = 0 ; i < n ; i++){
            array[i] = scan.nextInt();
        }
        sort.MergeSort(array, 0, n-1);
        for(int i = 0 ; i < n ; i++){
            System.out.print(array[i] + "   ");
        }
    }

    void Merge(int[] array, int left, int mid, int right){
        if(left > mid || mid >= right){
            System.out.println("\n Exist an empty segment");
            return;
        }
        int left_first = left; 
        int left_second = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left_first <= mid && left_second <= right){
            if(array[left_first] > array[left_second]){
                // System.out.println(array[left_second]);
                temp.add(array[left_second]);
                left_second++;
            }
            else{
                // System.out.println(array[left_first]);
                temp.add(array[left_first]);
                left_first++;
            }
        }
        if(left_first > mid){
            // System.out.println(array[left_second] + " instance 1");
            for(int i = left_second ; i <= right ; i++){
                temp.add(array[i]);
            }
        }
        else{
            // System.out.println(array[left_first] + " instance 2");
            for(int i = left_first; i <= mid ; i++){
                temp.add(array[i]);
            }
        }
        while(temp.size() != 0){
            array[left] = temp.get(0);
            temp.remove(0);
            left++;
        }
    }

    void MergeSort(int[] array , int left , int right){
        if(right > left){
            int mid = (right + left)/2;
            MergeSort(array, left, mid);
            MergeSort(array, mid + 1, right);
            Merge(array , left , mid , right); // merge array includes left to mid indexs with array                                               // includes mid+1 to right index
        }
    }
}