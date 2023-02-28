package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class binaryToDecimal {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc  = new Scanner(System.in);
        int a  = sc.nextInt();
        // int b = sc.nextInt();
        int ans = getDec(a);
        System.out.println(ans);

    }
    public static int getDec(int n){
       int temp  =0;
       int count = 0;
       int i = 0;
       while(n>0){
          temp = n%10;
          count = count+temp*(int)Math.pow(2,i++);
          n=n/10; 
       }
       return count;
    }
}
