package tcsDigital;
import java.util.*;
public class strangeNum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count = 2;
        int max = 0; 
        int sq = (int)Math.sqrt(n);
          while(n>1){
            if(n%count==0){
                n=n/count;
                max =Math.max(max,count);
            }
            else{
                count++;
            }
          }
          if(sq<max){
            System.out.println("strange");
          }
          else{
            System.out.println("not strange");
          }






    //    int max = Integer.MIN_VALUE;
    //    int m = (int)Math.sqrt(n);
    //     while(count!=n){
    //         if(n%count==0 && isPrime(count)){
    //             max= Math.max(max,count);  
    //         }
    //         count++;
    //     }
    //     if(m<max){
    //         System.out.println("strong");
    //     }
    //     else {
    //         System.out.println("not strong");
    //     }
    // }
    // public static boolean isPrime(int n){
    //     if(n<=1){
    //         return false;
    //     }
    //     else if(n==2||n==3){
    //         return true;
    //     }
    //     else if(n%2==0 || n%3==0){
    //         return false;
    //     }
    //     for(int i = 4;i<=n ;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    }
}
