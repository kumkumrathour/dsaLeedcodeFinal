package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class addFraction {
    public static void main(String[] args){
        System.out.println("enter");
        int a = 3;
        int b = 9;
        int  ans = getlcm(a,b);
        System.out.println(ans);
    }
    public static int getlcm(int a, int b){
        int l = (a>b)?a:b;
        int m =0;
        for(int i= l ;i<=a*b ; i*=l){
            if(i%a==0 && i%b==0){
             m=i;
             break;
            }
        }
        return m;
    }
}
