package top100Question.gettingStarted.String;
import java.util.*;
public class replaceAll {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String c = s.replaceAll("[(){}]","");
        // System.out.println(c);
        int sum = 0;
        for(int i = 0 ;i<s.length();i++){
            // if(s.charAt(i)!=' ' && s.charAt(i)!='\t'){
            //     continue;
            // }
            if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
                sum+=(s.charAt(i)-'0');
            }
        }
        System.out.println(sum);
    }
}
