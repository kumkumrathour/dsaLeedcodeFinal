package tcsDigital.previousYear;
import java.util.*;
public class nearestLargerNum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = solution(a,b);
        System.out.println(ans);
    }
    public static int solution(int a, int b){
        if(a>b){
            return a;
        }
        int temp = a;
        int rem = 0;
        while(temp>0){
            rem=temp%10;
            
        }
    }
}
