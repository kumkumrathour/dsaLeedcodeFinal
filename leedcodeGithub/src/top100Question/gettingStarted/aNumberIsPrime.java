package top100Question.gettingStarted;
import java.util.Scanner;
import java.util.*;
public class aNumberIsPrime {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // six ways to solve this problem 
        // first 
        int count =0;
        for(int i = 2 ;i<n ; i++){
            if(n%i == 0){
             count++;
            }
        }
        if(count>0){
            System.out.println("not prime");
        }
        else{
            System.out.println("its prime");
        }

    }
}
