package top100Question;
import java.util.Scanner;
import java.util.*;
public class primeNoBestAppr {
    public static void  main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    public static boolean isPrime(int n){
        if(n<1)
        return false;
        else if(n==2)
        return true;
        else if(n%2==0)
        return false;
        for(int i =3; i<=Math.sqrt(n) ;i=i+2){
            if(n%i==0)
            return false;
        }
        return true;
        }
}
