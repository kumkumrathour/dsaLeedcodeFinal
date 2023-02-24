package top100Question;
import java.util.*;
public class armstrong {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = val(n);
        int ans = aramStr(n, len);
         if(n==ans){
            System.out.println("palindron");
         }
         else{
            System.out.println("not a palindrom");
         }
    }
    public static int val(int x){
        int n= 0;
        while(x !=0){
            n++;
            x=x/10;
        }
        return n;
    }
    public static int aramStr(int n , int l){
        int sum = 0;
        int temp = n;
        while(temp !=0){
            int digit = temp%10;
            sum=sum+(int)Math.pow(digit,l);
            temp/=10;
        } 
        return sum;
    }
}
