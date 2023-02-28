package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class binaryToOctal {
    public static void main(String[] args){
        System.out.println("enter");
       int n = 10011;
       int value = binToDec(n);
       int ans = decToOct(value);
       System.out.println(ans);
    }
    public static int binToDec(int n){
        int temp = n;
        int sum = 0;
        int rem =0;
        int j = 0;
        while(temp>0){
            rem =temp%10;
            sum=sum+rem*(int)Math.pow(2,j++);
            temp = temp/10;
        }
        return sum;
    }
    public static int decToOct(int n){
        int temp =n;
        int rem= 0;
        String sum ="";
        while(temp>0){
            rem=temp%8;
            sum= rem+sum;
            temp= temp/8;
        }
        return Integer.parseInt(sum);
    }
}
