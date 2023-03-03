package top100Question.gettingStarted.recursion;
import java.util.*;
public class lengthOfString {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        int ans = solution(s);
        System.out.println(ans);
    }
    public static int solution(String s){
          if(s.equals("")){
            return 0;
          }
        return solution(s.substring(1))+1;
    }
}
