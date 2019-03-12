import java.util.Scanner;
public class KTLT16_2{
    public static void main(String[] args){
        for(int num=10; num<20; ++num){
            int isPrime=1;
            for(int i=2; i<num; ++i){
                if(num%i==0){
                    int j=num/i;
                    System.out.println(num+ " la bang "+ i+ " * "+j);
                    isPrime=0;
                    break;
                }
            }
            if(isPrime!=0){
                System.out.println(num+ " la so nguyen to");
            }
        }
    }
}
        