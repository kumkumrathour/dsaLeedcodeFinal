package Topic.string;
import java.util.Scanner;
public class removeDupilcate {
    public static String solution(String s){
        StringBuilder str = new StringBuilder(s);
        str.append(s.charAt(0));
        for(int i = 1; i<str.length();i++){
            char current = str.charAt(i);
            char pre = str.charAt(i-1);
            int gap = current -pre;
            str.append(gap);
            str.append(current);
        }
        return str.toString();
    }
    public static void main(String[] args){
        System.out.println("enter the string");
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     System.out.println(solution(s));
    }
}

