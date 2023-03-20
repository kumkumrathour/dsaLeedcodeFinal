package tcsDigital;
import java.util.*;
public class reverseEachWord {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = solution(s);
        System.out.print(ans+" ");
    }
    public static String solution(String s){
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String val : str){
            char[] c = val.toCharArray();
            swap(c ,0 ,c.length-1);
            sb.append(c).append(" ");
        }
        return sb.toString().trim();
    }
    public static void swap(char[] s, int f , int l ){
        while(f<l){
       char temp=s[f];
       s[f] =s[l];
       s[l] = temp;
       f++;
       l--;
        }
    }
}
