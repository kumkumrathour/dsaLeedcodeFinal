package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class nisSumOfTwoPrime {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int x = 0;
        for(int i = 2 ;i<=n/2 ; i++){
            if(isPrime(i)==1){
               if(isPrime(n-i)==1){
                System.out.println("yes its sum of prime");
                x =1;
               }
            }
        }
        if(x==0){
            System.out.println("not a prime");
        }

    }
    public static int isPrime(int n){
        int val = 1;
        for(int i = 2 ;i<n;i++){
            if(n%i==0){
                val = 0;
                break;
            }
        }
        return val;
    }
}
