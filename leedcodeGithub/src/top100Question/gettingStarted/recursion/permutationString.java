package top100Question.gettingStarted.recursion;
import java.util.*;
public class permutationString {
    public static void main(String[] args){
        System.out.println("enter");
        String s = "abc";
        printPer(s,"");
    }
    public static void printPer(String s, String ans){
    if(s.length()==0){
        System.out.println(ans+"");
    }
    for(int i = 0 ; i<s.length();i++){
        char ch = s.charAt(i);
        String r = s.substring(0,i)+s.substring(i+1);
        printPer(r,ans+ch);

    }
    }
}
