package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class handShake {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value =1;
         value = n*(n-1)/2;
         System.out.println(value);
    }
}
