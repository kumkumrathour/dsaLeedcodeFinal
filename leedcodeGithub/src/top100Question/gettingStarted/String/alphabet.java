package top100Question.gettingStarted.String;
import java.util.*;
public class alphabet {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        if(s>='A' && s<='Z' || s>='a' && s<='z'){
            System.out.println("its a character"+" "+s);
        }
        else{
            System.out.println("its not a character"+" "+s);
        }
    }
}
