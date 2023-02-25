package top100Question.gettingStarted;
import java.util.Scanner;
import java.util.*;
public class factorialOfANum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int count = 1;
        // int mult = 1;
        // while(n>=count){
        //  mult*=count;
        //  count++;
        // }
        // System.out.println(mult);
        int ans = getVal(n);
        System.out.println(ans);
    }
    public static int getVal(int n ){
        if(n==1){
            return 1;
        }
        return n*getVal(n-1);
    }
}
