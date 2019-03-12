class Get_Ratios{
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,0};
        int size_array = 3;
        float[] array_ratios = new float[size_array];
        for(int index = 0 ; index < size_array ; index++){
            try {
                array_ratios[index] = (float)array1[index] / array2[index];    
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //TODO: handle exception
            }
        }
        for(int i = 0 ; i < size_array ; i++){
            System.out.printf(array_ratios[i] + "  ");
        }
    }
}