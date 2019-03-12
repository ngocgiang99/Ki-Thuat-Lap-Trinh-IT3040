import java.util.Scanner;
public class KTLT15_3{
    public static void main(String[] args){
        int var = 100;
        if(var < 200){
            System.out.println("Gia tri cua bieu thuc la nho hon 200");
            if(var == 150){
                System.out.println("Gia tri cua bieu thuc la 150");
            } else if(var == 100){
                System.out.println("Gia tri cua bieu thuc la 100");
            } else if(var == 50){
                System.out.println("Gia tri cua bieu thuc la 50");
            } else{
                System.out.println("Khong tim thay bieu thuc dung");
            }
        }
    }
}