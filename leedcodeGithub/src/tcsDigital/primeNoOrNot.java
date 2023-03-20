package tcsDigital;
import java.util.*;
public class primeNoOrNot {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("not a prime number");
        }
        int count  =0;
        for(int i = 2 ;i<=Math.sqrt(n);i++){
             if(n%i==0){
                count++;
             }
        }
        if(count>=1){
            System.out.println("not a prime");
        }else{
            System.out.println("prime");
        }
    }
}
