import java.util.Scanner;
public class bubble_sort{
    public static void BubbleSort(int[] a_list){
        for(int pass_num=a_list.length-1; pass_num>0; --pass_num){
            for(int i=0; i<pass_num; ++i){
                if(a_list[i]>a_list[i+1]){
                    int temp=a_list[i];
                    a_list[i]=a_list[i+1];
                    a_list[i+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] a_list={54, 26, 93, 17, 77, 31, 44, 55, 20};
        BubbleSort(a_list);
        for(int i=0; i<a_list.length; ++i){
            System.out.println(a_list[i]);
        }
    }
}