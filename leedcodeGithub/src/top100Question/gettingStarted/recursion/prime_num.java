package top100Question.gettingStarted.recursion;
import java.util.*;
public class prime_num {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        Boolean ans = getVal(n,count);
        System.out.println(ans);
    }
    public static boolean getVal(int n , int count){
          if(n<2){
            return false;
          }
          else if(n==2){
            return true;
          }
          else if(n%2==0){
            return false;
          }
          else if(count*count>n){
            return true;
          }
          return getVal(n,count+1);
    }
}
