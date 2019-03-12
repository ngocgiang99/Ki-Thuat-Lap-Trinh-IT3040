import java.util.*;

public class KT13_3 {


    public static void main(String args[]) {
        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        List<Integer> l2 = new ArrayList<Integer>();

        l2 = l1;
        System.out.println(l1);
        System.out.println(l2);

        l2.set(0,5);

        System.out.println(l1);
        System.out.println(l2);

    }
}