import java.util.Scanner;
public class binary_search{
    public static int BinarySearch(int[] lst, int target){
        int i=0;
        int j=lst.length-1;
        while(i<j){
            int m=(i+j)/2;
            if(lst[m]<target){
                i=m+1;
            } else{
                j=m;
            }
        }

        if(lst[i]==target){
            return i;
        } else{
            return -1;
        }
    }
    public static void main(String[] args){
        int[] a_list = {0,1,2,3,4,5};
        System.out.println(BinarySearch(a_list,2));
    }
}