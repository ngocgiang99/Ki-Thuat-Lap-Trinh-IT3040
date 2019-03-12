import java.util.Scanner;
public class quick_sort{ 
    public static void QuickSort(int[] a_list){
        quickSortHelper(a_list, 0, a_list.length-1);
    }

    public static void quickSortHelper(int[] a_list, int first, int last){
        if(first < last){
            int split_point = Partition(a_list, first, last);
            quickSortHelper(a_list, first, split_point - 1);
            quickSortHelper(a_list, split_point+1, last);
        }
    }

    public static int Partition(int[] a_list, int first, int last){
        int pivot_value = a_list[first];
        int left_mark = first + 1;
        int right_mark = last;

        boolean done = false;
        while(done==false){
            while(left_mark <= right_mark && a_list[left_mark] <= pivot_value){
                left_mark = left_mark + 1;
            }
        
            while(left_mark <= right_mark && a_list[right_mark] >= pivot_value){
                right_mark = right_mark - 1;
            }
        
            if(right_mark < left_mark){
                done = true;
            }
            else{
                int temp = a_list[left_mark];
                a_list[left_mark] = a_list[right_mark];
                a_list[right_mark] = temp;
            }
        }

        int temp = a_list[first];
        a_list[first] = a_list[right_mark];
        a_list[right_mark] = temp;

        return right_mark;
    }
    public static void main(String[] args){
        int[] a_list = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        QuickSort(a_list);
        for(int i = 0; i < a_list.length; ++ i){
            System.out.println(a_list[i]);
        }
    }
}
