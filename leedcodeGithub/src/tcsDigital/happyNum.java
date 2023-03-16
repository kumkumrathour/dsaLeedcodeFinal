package tcsDigital;
import java.util.*;
public class happyNum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s =0;
        int rem = 0;
        while(n>9){
            while(n!=0){
                rem = n%2;
                s+=(int)Math.pow(rem,2);
                n=n/10;
            }
            n=s;
            s =0;
            if(n==1){
                System.out.println("happy");
            }else{
                System.out.println("unhappy");
            }

        }
    //     while(n>9){
    //         solution(n);
    //     }
    //     if(n==1){
    //         System.out.println("Happy no.");
    //     }
    //     else{
    //         System.out.println("unhappy no.");
    //     }

    // }
    // public static int solution(int n){
    //     int s =0;
    //     while(n!=0){
    //       int rem = n%2;
    //       s=s+(int)Math.pow(rem,2);
    //       n=n/10;
    //     }
    //     return s;
    }
}
