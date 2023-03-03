package tcsDigital;
import java.util.*;
public class solveAnEqua {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] ans = new int[n+1];
        for(int i = 0 ; i<=n ;i++){
            int x = sc.nextInt();
             ans[x] =i;
        }
        for(int i = 0 ; i<=n ;i++){
            int y = ans[ans[i]];
            System.out.println(y);
        }
    }
    
}
