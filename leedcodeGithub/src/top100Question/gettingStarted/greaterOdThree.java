package top100Question.gettingStarted;
import java.util.Scanner;
import java.util.*;
public class greaterOdThree {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = Math.max(a,b);
       int res = Math.max(d,c);
       System.out.println(res);
    }
}
