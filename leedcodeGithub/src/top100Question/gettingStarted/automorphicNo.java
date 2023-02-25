package top100Question.gettingStarted;
import java.util.*;
public class automorphicNo {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int sq =n*n;
        int rem =n%10;
        int sqRem= sq%10;
        if(rem==sqRem){
            System.out.println("auto");
        }
        else{
            System.out.println("not auto");
        }
        
    }
}
