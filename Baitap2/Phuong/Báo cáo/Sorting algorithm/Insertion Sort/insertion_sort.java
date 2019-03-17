import java.util.Scanner;
public class insertion_sort{
    public static void InsertionSort(int[] a_list){
        for(int index = 1; index < a_list.length; ++ index){
            int current_value = a_list[index];
            int position = index;
            
            while(position > 0 && a_list[position-1] > current_value){
                a_list[position] = a_list[position-1];
                position --;
            }

            a_list[position] = current_value;
        }
    }
    public static void main(String[] args){
        int[] a_list = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        InsertionSort(a_list);
        for(int i = 0; i < a_list.length; ++ i){
            System.out.println(a_list[i]);
        }
    }
}


