import java.util.*;

public class KT13_4 {

    public static void main(String args[]) {

        System.out.println(sum_elem_method2(Arrays.asList(1,2,3,3)));
        System.out.println(sum_elem_method2(List.of(1,2,3,5)));
    }

    static int sum_elem_method1(List<Integer> L) {
        int total = 0;
        for(int i = 0; i < L.size(); ++i) 
            total += L.get(i);
        return total;
    }

    static int sum_elem_method2(List<Integer> L) {
        int total = 0;
        for(int i: L) 
            total += i;
        return total;
    }
}