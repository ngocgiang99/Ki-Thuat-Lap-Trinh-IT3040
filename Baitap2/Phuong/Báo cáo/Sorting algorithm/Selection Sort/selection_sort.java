import java.util.Scanner;
public class selection_sort{  
    public static void SelectionSort(double[] a_list)
    {
        for(int fill_slot = a_list.length - 1; fill_slot > 0 ; fill_slot --)
        {
            int positionOfMax = 0;
            for(int location = 1; location <= fill_slot; location ++ )
                if( a_list[location] > a_list[positionOfMax])
                    positionOfMax = location;

            double temp = a_list[positionOfMax];
            a_list[positionOfMax] = a_list[fill_slot];
            a_list[fill_slot] = temp;
        }
    }

    public static void main(String[] args) {
        double[] a_list = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        SelectionSort(a_list);
        for(int idx = 0; idx < a_list.length; idx ++)
        {
            System.out.println(a_list[idx]);
        }
    }
}  