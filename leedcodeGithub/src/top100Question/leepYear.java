package top100Question;
import java.util.*;
import java.util.Scanner;
public class leepYear {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4 ==0){
            System.out.println("Leap");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
