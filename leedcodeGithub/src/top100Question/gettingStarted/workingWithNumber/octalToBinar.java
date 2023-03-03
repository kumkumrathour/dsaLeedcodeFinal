package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class octalToBinar {
    public static void main(String[] args){
        System.out.println("enter");
        int n = 347;
        int value = octToDec(n);
        int ans = decToBinary(value);
        System.out.println(ans);

    }
    public static int octToDec(int n){
        int temp = n;
        int sum = 0;
        int j = 0;
        int rem = 0;
        while(temp>0){
            rem = temp%10;
            sum=sum+rem*(int)Math.pow(8,j++);
            temp=temp/10;
        }
        return sum;
    }
    public static int decToBinary(int n){
        int temp =n ;
        String s ="";
        int rem = 0;
        while(temp>0){
            rem = temp%2;
            s =rem+s;
            temp=temp/2;
        }
        return Integer.parseInt(s);
    }
}
