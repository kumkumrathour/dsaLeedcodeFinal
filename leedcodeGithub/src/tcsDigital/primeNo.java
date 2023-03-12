package tcsDigital;
import java.util.*;
public class primeNo {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        for(int i= a; i<=b-6 ;i++){
          if(solution(i) && solution(i+6)){
            System.out.println(i+" "+(i+6));
          }

        }
    }
    public static boolean solution(int n){
        if(n<=1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        else if(n%2==0){
            return false;
        }
        for(int i = 3; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
