package top100Question.gettingStarted.String;
import java.util.*;
public class removeVoeal {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String st ="";
        for(int i = 0; i<s.length() ;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='o'||s.charAt(i)=='u'|| s.charAt(i)=='i'){
               continue;
            }
            else if(s.charAt(i)>='1'&& s.charAt(i)<='9'){
                continue;
            }
            else{
                st=st+s.charAt(i);
            }
        }
        System.out.println(st);
    }
}
