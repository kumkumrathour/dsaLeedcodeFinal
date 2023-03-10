package top100Question.gettingStarted.String;
import java.util.*;
public class findLengthOfString {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = 0 ;
        for(char c  : s.toCharArray()){
           l++;
           System.out.println(s.toCharArray());
        }
        System.out.println(l);
    }
}
