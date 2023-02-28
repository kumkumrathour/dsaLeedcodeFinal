package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class decimalToBinary {
    public static void main(String[] args){
        System.out.println("enter");
        int n =  34;
        int v = n;
        String s = "";
        while(v>0){
            int rem = v%2;
            v=v/2;
            s=s+rem;
        }
        System.out.println(s);
    }
}


