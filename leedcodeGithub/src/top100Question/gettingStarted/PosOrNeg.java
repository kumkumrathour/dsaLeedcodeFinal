package top100Question.gettingStarted;
import java.util.Scanner;
import java.util.*;
public class PosOrNeg {
    public static void main(String[] args){
        System.out.println("enter the number");
      Scanner sc = new Scanner(System.in);
      int  n =  sc.nextInt();
       if(n<0){
        System.out.println("negative no");
       }
       else if(n>0){
        System.out.println("positive no");
       }
       else{
        System.out.println("zero");
       }
    }
}
