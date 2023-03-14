package tcsDigital.previousYear;
import java.util.*;
public class splitPalindrom {
    public static void main(String[] args){
        System.out.println("enter");
        String w = "nayannamantenet";
        solution(w);
    }
    public static void solution(String w){
         for(int i =0 ; i<w.length();i++){
            for(int j = i+1 ;j<=w.length();j++){
                 String ss= w.substring(i,j);
                 if(isPalin(ss)==true){
                    System.out.print(ss+" ");
                 }
                }
            }
    }
    public static boolean isPalin(String ss){
            int i = 0 ;
            int j = ss.length()-1;
            while(i<=j){
                char ch1= ss.charAt(i);
                char ch2 = ss.charAt(j);
                if(ch1!=ch2){
                    return false;
                }
                else{
                    i++;
                    j--;
                }
                
            }
            return true;   
    }
}
