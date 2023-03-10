package top100Question.gettingStarted.String;
import java.util.*;
public class removeAllChar {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // StringBuilder st = new StringBuilder();
        String st = "";
        for(int i = 0; i<s.length();i++){
           if(s.charAt(i)>=1 && s.charAt(i)<=9){
             continue;
           }
           else if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a'&& s.charAt(i)<='z'){
              st=st+s.charAt(i);
           }
           else{
            continue;
           }
        }
        System.out.println(st);
    }
}
