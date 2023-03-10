package top100Question.gettingStarted.String;
import java.util.*;
public class removeSpaces {
    public static void main(String[] args){
        System.out.println("enter");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            StringBuilder st = new StringBuilder();
            for(int i = 0; i<s.length() ; i++){
               if((s.charAt(i) !=' ') && (s.charAt(i)!='\t')){
                   st.append(s.charAt(i));
               }
            }
            System.out.println(st);
    }
}
