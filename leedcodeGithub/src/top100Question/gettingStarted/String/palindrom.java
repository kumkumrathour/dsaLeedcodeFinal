package top100Question.gettingStarted.String;
import java.util.*;
public class palindrom {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String st = "";
        for(int  i = s.length()-1 ; i>=0 ; i--){
           st = st+s.charAt(i);
        }
          if(s.equals(st)){
            System.out.println("it is a palindrom");
          }
          else{
            System.out.println("not a palindrom");
          }
    }
}
