class Revert_List{
    public static void main(String[] args) {
        int[] a = {1 , 2, 3, 4};
        int size_a = 4 ;
        for(int index = 0 ; index <= (size_a-1)/2 ; index++){
            int index_opposite = size_a - 1 - index;
            int temp = a[index];
            a[index] = a[index_opposite];
            a[index_opposite] = temp;
        }
        for(int i = 0 ; i < size_a ; i++){
            System.out.printf(a[i] + "  ");
        }
    }
}