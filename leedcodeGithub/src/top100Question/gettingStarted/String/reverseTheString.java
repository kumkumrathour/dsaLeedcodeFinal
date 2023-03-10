package top100Question.gettingStarted.String;
import java.util.*;
public class reverseTheString {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String st = "";
        // for(int  i = s.length()-1; i>=0; i--){
        //     st=st+s.charAt(i);
        // }
        // System.out.println(st);
        StringBuilder st = new StringBuilder();
        st.append(s);
        System.out.println(st);
        st.reverse();
        System.out.println(st);

}
}
