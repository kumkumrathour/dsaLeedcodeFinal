package top100Question.gettingStarted.recursion;
import java.util.*;
public class reverseANum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getVal(n);
    }
    public static void getVal(int n){
        if(n<10){
            System.out.println(n);
            return;
        }
        else{
            System.out.print(n%10);
            getVal(n/10);
        }
    }
}
