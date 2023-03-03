package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class noOfDigit {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int ans = getVal(n);
        System.out.println(ans);
    }
    public static int getVal(int n){
        int digit= 0 ;
        int rem = 0;
        while(n>0){
             rem = n%10;
             digit++;
             n = n/10;
        }
        return digit;
    }
}
