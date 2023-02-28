package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class decimalToHexa {
    public static void main(String[] args){
        System.out.println("enter");
        int n =  726 ;
        int m = n;
        int rem = 0;
        int j = 0;
        char[] hex = new char[100];
        while(m>0){
            rem=m%16;
            if(rem<10){
              hex[j++]=(char)(rem+48);
            
            }
            else{
                hex[j++]=(char)(rem+55);
            
            }
            m=m/16;
        }
        for(int i = j-1 ;i>=0 ;i--){
         System.out.print(hex[i]);
        }
    }
}
