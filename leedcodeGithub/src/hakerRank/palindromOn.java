package hakerRank;
import java.util.Scanner;
public class palindromOn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();
        char[] arr =s.toCharArray();
        String rev = "";
        for(int i = s.length()-1 ; i>=0 ;i--){
            rev += arr[i];
        }
       System.out.println(s.equals(rev)? true: false);
    }
}
