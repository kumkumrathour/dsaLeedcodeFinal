package tcsDigital;
import java.util.*;
public class twoString {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(solution(n));
    }
    public static int solution(int n){
        int val = 1;
        int[] ans = new int[1000];
       int count= 0;
        for(int i=9 ;i>1 ;i--){
           while(n%i==0){
            ans[count++]=i;
           }
           n= n/10;
        }
        for(int i = 0; i<=count ;i++){
         val *=ans[i];
        }
        return val;
    }
}