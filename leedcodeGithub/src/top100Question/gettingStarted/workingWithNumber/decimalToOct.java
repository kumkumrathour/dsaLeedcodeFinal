package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class decimalToOct {
    public static void main(String[] args){
        System.out.println("enter");
        int n = 214;
        int m = n;
        String s ="";
        int rem = 0;
        while(m>0){
            rem=m%8;
            s = rem+s;
            m=m/8;
        }
        System.out.println(s);
    }
}
