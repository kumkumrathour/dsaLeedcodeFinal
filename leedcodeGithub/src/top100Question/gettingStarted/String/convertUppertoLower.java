package top100Question.gettingStarted.String;
import java.util.*;
public class convertUppertoLower {
    public static void main(String[] args){
         System.out.println("enter");
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         String st="";
         for(int i = 0; i<s.length() ;i++){
            if(Character.isUpperCase(s.charAt(i))){
                st=st+Character.toLowerCase(s.charAt(i));
            }
           else{
            st=st+Character.toUpperCase(s.charAt(i));
           }
        }
        System.out.println(st);
    }
}
