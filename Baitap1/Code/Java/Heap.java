import java.util.*;

class Heap{
    List<Integer> a = new ArrayList<Integer>();
    int height, heap_size;

    Heap(List<Integer> arr) {   
        this.a = new ArrayList<Integer>(arr);
        //this.height = (int) Math.log2((double) a.size());
        this.heap_size = a.size();
    }

    void println() {
        System.out.print("[");
        for(int i = 0; i < heap_size; ++i)
            if (i < heap_size - 1) System.out.print(a.get(i) + ",");
            else System.out.print(a.get(i));
        System.out.println("]");
    }
}