package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class permutationOfSeat {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int s = sc.nextInt();
        int ans = factOfNum(n);
        int ans1 = permuOfNum( n,s);
        int ans2 = ans/ans1;
        System.out.println(ans2);
    }
    public static int factOfNum(int n){
        int mult = 1;
        while(n>0){
           mult= mult*n;
           n--;
        }
        return mult;
    }
    public static int permuOfNum(int n,int s){
       int value = Math.abs(n-s);
       int mult =1;
       while(value>0){
          mult= mult*value;
          value--;
       }
       return mult;
    }
}
