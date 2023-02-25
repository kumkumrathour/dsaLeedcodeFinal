package top100Question.gettingStarted;
import java.util.*;
public class sumUsingRecursion {
     public static void main(String[] args){
        System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = getval(n);
        System.out.println(ans);
     }
     public static int getval(int n ){
        if(n==0){
            return 0;
        }
        return n + getval(n-1);
     }
}
