package tcsDigital;
import java.util.*;
public class substringSpecial {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String find = sc.next();
        for(int i = 0 ; i<s.length() ;i++){
            for(int j=i+1 ;j<=s.length();j++){
                String ss = s.substring(i,j);
                if(solution(ss,find)) {
                    System.out.println("true");
                    return ;
                }
            }
        }
        System.out.println("false"); 
    }
    public static boolean solution(String ss,String find){
         return ss.equals(find);
    }
}
