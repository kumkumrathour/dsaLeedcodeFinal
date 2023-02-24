package top100Question;
import java.util.*;
public class sumOfDigit {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        // while(n != 0){
        //     sum+=n%10;
        //     n= n/10;
        // }
        // System.out.println(sum);
        System.out.println("the sum is "+getSum(n,sum));
    }
    public static int getSum(int n , int sum){
        if(n==0){
            return sum;
        }
        sum+=n%10;
        return getSum(n/10,sum);
    }
}
