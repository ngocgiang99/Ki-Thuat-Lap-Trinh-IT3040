import java.util.*;

public class KT13_5 {

    public static void main(String args[]) {

        KT13_5 demo = new KT13_5();

        List<Integer> arr1 = new ArrayList<>(List.of(1,2,3,4));
        List<Integer> arr2 = new ArrayList<>(List.of(1,2,5,6));

        demo.remove_dups(arr1, arr2);
        System.out.println(arr1);
        System.out.println(arr2);

        arr1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        arr2 = new ArrayList<>(List.of(1,2,5,6));

        demo.remove_dups_new(arr1, arr2);
        System.out.println(arr1);
        System.out.println(arr2);

    }


    void remove_dups(List<Integer> L1, List<Integer> L2) {
        /*for(Iterator<Integer> iterator = L1.iterator(); iterator.hasNext();) {
            Integer obj = iterator.next();
            if (L2.contains(obj)) {
                iterator.remove();
            }
        }*/

        for(int i = 0; i < L1.size(); ++i)
            if (L2.contains(L1.get(i))) {
                L1.remove(i);
            }
    }

    void remove_dups_new(List<Integer> L1, List<Integer> L2) {
        List<Integer> L1_copy = new ArrayList<Integer>(L1);
        for(int e : L1_copy) 
            if (L2.contains(e)) {
                L1.remove(L1.indexOf(e));
            }
    }
}