package leedcode;
import java.util.*;


import javax.sound.sampled.SourceDataLine;

public class fibonacci_recursion {
  
    public static void main (String[] args){
       
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans= fib(n);
        System.out.println(ans);


    }


    static int fib(int n){

        return fib(n-1)+fib(-2);

    }
    
    
     
}
