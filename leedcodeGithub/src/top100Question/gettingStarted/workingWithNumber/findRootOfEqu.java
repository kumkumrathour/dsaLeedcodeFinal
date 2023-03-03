package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
// import   java.lang.Math.*;
public class findRootOfEqu {
    public static void main(String[] args){
        System.out.println("enter");
        int a = 1;
        int b = 4;
        int c =4 ;
        findroot(a,b,c);
    }
    public static void findroot(int a , int b , int c ){
        if(a==0){
            System.out.println("invalid");
        }
        int d = b*b-4*a*c;
        double dd = Math.sqrt(Math.abs(d));
        if(d>0){
            double x = (double)(-b+dd)/(2*a);
            System.out.println(x);
        }
        else if(d==0){
            double  y = (-(double)b/(2*a));
            System.out.println(y);
        }
        else{
            double z = -(double)b/2*a;
            System.out.println(z);
        }
    }

}
