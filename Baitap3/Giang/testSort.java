class testSort {
    public static void main(String args[]) {

        int[] arr = {5, 1 , 3, 4, 2};
        MergeSort.sort(arr);
    
        for(int i = 0; i < arr.length; ++i)
            System.out.println(arr[i]);
        }
}    