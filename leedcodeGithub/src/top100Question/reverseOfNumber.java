package top100Question;
import java.util.*;
public class reverseOfNumber {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int rem =0;
        int ans = getRev(n,rev);
        System.out.println(ans);
    }
    //    while(n!=0){
    //     rem= n%10;
    //      rev = rev*10+rem;
    //     n= n/10;
    //    }
    //    System.out.println(rev);
    public static int getRev(int n , int rev){
        int rem = 0;
        if(n ==0){
            return rev;
        }
         rem= n%10;
         rev=rev*10+rem;
         return getRev(n/10, rev);

    }
    
}
