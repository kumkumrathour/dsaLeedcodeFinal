package top100Question.gettingStarted.recursion;
import java.util.*;
public class hcfUsingrec {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = solution(a,b);
        System.out.println(ans);
    }
    public static int solution(int a , int b){
        if(b==0){
            return a;
        }
        return solution(b,a%b);
    }
}
