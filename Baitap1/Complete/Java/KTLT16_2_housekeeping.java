import java.util.Scanner;
public class KTLT16_2_housekeeping{
    public static void main(String[] args){
        int[] H={0, 1, 3, 5, 7};
        int[] a=new int[100];
        for(int i=0; i<H.length; ++i){
            a[i]=H[i];
            System.out.println(a[i]);
        }
    }
}