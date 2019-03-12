import java.util.*;
import java.lang.Math;

class HeapsortRunner {

    public static void main(String args[]) {

        Heap a = new Heap(List.of(4, 5, 9, 34, 12, 45, 9, 45, 12, 23, 8, 1, 35));
        //build_max_heap(a);
        a.println();
        heap_sort(a);
        a.println();
    }

    static int parent(int i) {
        return i/2;
    }

    static int left(int i) {
        return i*2 + 1;
    }

    static int right(int i) {
        return i*2 + 2;
    }

    static void swap(List<Integer> L, int i, int j) {
        int temp = L.get(i);
        L.set(i, L.get(j));
        L.set(j, temp);
    }

    static void max_heapify(Heap a, int i) {
        int l = left(i), r = right(i);
        int largest = 0;

        if (l < a.heap_size &&  a.a.get(l) > a.a.get(i))
            largest = l;
        else 
            largest = i;

        if (r < a.heap_size && a.a.get(r) > a.a.get(largest))
            largest = r;
        if (largest != i) {
            swap(a.a, i, largest);
            max_heapify(a, largest);
        }
    }

    static void build_max_heap(Heap a) {
        for(int i = a.heap_size/2; i >= 0; --i) {
            max_heapify(a, i);
        }
    }

    static void heap_sort(Heap a) {
        build_max_heap(a);
        int len = a.heap_size;
        for(int i = a.heap_size-1; i >= 0; --i) {
            swap(a.a, i, 0);
            --a.heap_size;
            max_heapify(a, 0);
        }
        a.heap_size = len;
    }
}