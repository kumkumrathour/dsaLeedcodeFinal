package top100Question.gettingStarted;
import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fibo(n);
        System.out.println(ans);
    }
    public static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }    
        return fibo(n-1)+fibo(n-2);
}
}
