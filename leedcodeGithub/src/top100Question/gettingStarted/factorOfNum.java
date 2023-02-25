package top100Question.gettingStarted;
import java.util.*;
public class factorOfNum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        while(n !=count){
            if(n%count==0){
                System.out.println(count);
            }
            count++;
        }
    }
}
