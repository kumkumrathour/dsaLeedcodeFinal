package top100Question;
import java.util.*;
public class sumInRange {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =  sc.nextInt();
        int ans = getSum( n, m);
        System.out.println(ans);
    }
    public static int getSum(int n , int m){
        int sum = 0;
        for(int i = n; i<=m ; i++){
            sum+=i;
        }
        return sum;
    }
}
