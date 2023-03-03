package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class findPrime1to100 {
    public static void main(String[] args){
        System.out.println("enter");
        for(int i = 1; i<100 ; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean isPrime(int n){
        boolean ans = true;
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i = 3 ;i<n/2;i++){
            if(n%i==0){
                ans = false;
            }
        }
        return ans;
    }
}
