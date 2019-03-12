import java.util.Scanner;
public class KTLT16_2_nesting{
    public static void main(String[] args){
        int i = 2;
        while(i < 100){
            int j = 2;
            while(j <= (i/j)){
                if(i % j == 0){
                    break;
                }
                j = j + 1;
            }

            if(j > i/j){
                System.out.println(i+" la so nguyen to");
            }
            i = i + 1;
        }

        System.out.println("Good bye!");
    }
}