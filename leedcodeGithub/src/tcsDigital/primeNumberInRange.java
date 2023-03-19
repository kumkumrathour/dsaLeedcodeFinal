package tcsDigital;
import java.util.*;
public class primeNumberInRange {
    public static void main(String[] args){
        System.out.println("enter");
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int  i= a; i<=b ;i++){
        if(solution(i)){
            sum+=i; 
        }
        }
        System.out.println(sum);
        }
        public static boolean solution(int n){
            if(n==1){
                return false;
            }
            for(int j = 2; j*j<=n ;j++ ){
            if(n%j==0){
            return false;
           }
         }
          return true;
         }
        }

