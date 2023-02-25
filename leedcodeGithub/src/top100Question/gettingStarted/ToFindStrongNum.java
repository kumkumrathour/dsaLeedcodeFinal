package top100Question.gettingStarted;
import java.util.*;
public class ToFindStrongNum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc
         = new Scanner(System.in);
        int n  = sc.nextInt();
        int temp =n;
        int rem = 0;
        int mult = 1;
        int sum = 0;
        while(temp!=0){
            rem = temp%10;
            while(rem !=1){
                mult=  mult*rem;
                rem--;
            }
             sum +=mult;
            temp = temp/10;
            mult =1;
        }
        System.out.println(sum);
        if(n==sum){
            System.out.println("strong");
        }
        else{
            System.out.println("not strong");
        }
    }
}
