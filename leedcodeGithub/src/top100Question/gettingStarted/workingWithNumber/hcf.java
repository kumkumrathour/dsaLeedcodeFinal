package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class hcf {
    public static void main(String[] args){
        System.out.println("hello");
        // int a = 36 ;
        int b = 7 ;
        boolean[] ans = getPrime(b);
        for(int i = 0; i<=b ;i++){
            System.out.println(ans[i]);
        }   
    }
    public static boolean[] getPrime(int n){
        boolean[] ans = new boolean[n+1];
        Arrays.fill(ans,true);
        ans[0] = false;
        ans[1] = false;
        for(int i = 2; i*i<=n;i++){
            for(int j = 2*i ;j<n ; j+=i){
                ans[j] = false;
            }
        }
        return ans ;
    }

}
