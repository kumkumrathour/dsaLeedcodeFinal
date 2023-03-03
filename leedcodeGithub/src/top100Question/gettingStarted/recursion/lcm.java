package top100Question.gettingStarted.recursion;
import java.util.*;
public class lcm {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = solution(a,b);
        int lcm = (a*b)/ans;
        System.out.println(lcm);
        }
        public static int solution(int a , int b){
            if(b==0){
                return a;
            }
            return solution(b,a%b);
        }
}
