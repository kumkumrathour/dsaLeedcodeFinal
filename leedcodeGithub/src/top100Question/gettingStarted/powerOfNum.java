package top100Question.gettingStarted;
import java.util.*;
public class powerOfNum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int p = sc.nextInt();
        int mult = 1;
        // mult = (int)Math.pow(n,p);
        // System.out.println(mult);
        while(p!=0){
            mult = mult*n;
            p--;
        }
        System.out.println(mult);
    }
}
