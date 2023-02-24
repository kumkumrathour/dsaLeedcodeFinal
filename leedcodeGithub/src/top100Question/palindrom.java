package top100Question;
import java.util.*;
public class palindrom {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev= 0;
        int ans = revVal(n,rev);
        if(n==ans){
            System.out.println("its a palindrom");
        }
        else{
            System.out.println("its not a palindrom");
        }
        
    }
    public static int revVal(int n , int rev ){
        int rem  =0;
        if(n==0)
        return rev;
        rem = n%10;
        rev=rev*10+rem;
        return revVal(n/10,rev);
    }
}
