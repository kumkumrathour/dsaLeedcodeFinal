package top100Question.gettingStarted.String;
import java.util.*;
public class replaceword {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String fw = sc.nextLine();
        String ss  =s.replaceAll(fw,"");
        System.out.println(ss);
    }
}
