package top100Question.gettingStarted.String;
import java.util.*;
public class vowelOrConsonant {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int countV =0 ;
        int countC = 0;
        for(int i =0 ; i<n ;i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                   countV++;
            }else{
                countC++;
            }
        }
        System.out.println(countV);
        System.out.println(countC);
    }
}
