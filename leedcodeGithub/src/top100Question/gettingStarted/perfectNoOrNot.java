package top100Question.gettingStarted;
import java.util.*;
public class perfectNoOrNot {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int fact = 0;
        while(n>count){
           if(n%count ==0){
            fact += count;
            count++;
           }
           else{
            count++;
           }
        }
        if(fact==n){
            System.out.println("perfect num");
        }
        else{
            System.out.println("not a perfect no");
        }
    }
}
