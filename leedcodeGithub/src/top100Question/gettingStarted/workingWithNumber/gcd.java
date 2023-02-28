package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class gcd {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=  sc.nextInt();
        int ans = getgcd(a,b);
        System.out.println(ans);
    }
    public static int getgcd(int a , int b){
          if(b==0){
            return a;
          }
          return getgcd(b,a%b);
    }
}
