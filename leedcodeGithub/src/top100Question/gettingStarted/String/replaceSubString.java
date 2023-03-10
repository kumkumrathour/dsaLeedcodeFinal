package top100Question.gettingStarted.String;
import java.util.*;
public class replaceSubString {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String os = sc.nextLine();
        String ns=sc.nextLine();
        String fs =st.replaceAll(os,ns);
        System.out.println(fs);
    }
}
