package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class octalToDecimal {
    public static void main(String[] args){
          System.out.println("enter");
          int n = 45 ;
          int ans = getOct(n);
          System.out.println(ans);
    }
    public static int getOct(int n){
        int temp = 0;
        int count = 0;
        int i = 0;
        while(n>0){
           temp = n%10;
           count +=temp*(int)Math.pow(8,i++);
           n=n/10;
        }
        return count ;
    }
}
