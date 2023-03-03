package top100Question.gettingStarted.recursion;
import java.util.*;
public class powerOfNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int ans = getPow(n,p);
        System.out.println(ans);
    }
    public static int getPow(int n ,int p){
        if(p==0){
            return 1;
        }
        return n*getPow(n,p-1);
    }
}
