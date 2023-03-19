package tcsDigital;
import java.util.*;
public class gcdOfThree {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans1 = solution(a,b);
        int ans2= solution(ans1,c);
        System.out.println(ans2);
    }
    public static int solution(int a ,int b){
        if(b == 0){
            return a;
        }
        return solution(b,a%b);
    }
}
