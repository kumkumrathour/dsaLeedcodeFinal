package kunalDSA.array;
import java.util.Scanner;

import hakerRank.arraySumFunc;

//  aramstrong number vo number hote ha jinka sum of cube of individual digit is equal to the number
//  371 is a number then this number is equal to 
//  371 = 3 ki power 3+ 7 ki power 3+ 1 ki power 3;


public class armStrongRecur {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println(" enter number");
       int n = sc.nextInt();
       int ans = armstrong(n);
       if(ans == n){
        System.out.println("armstrong");
       }
       else{
        System.out.println("not armstrong");
       }
    }
    public static int armstrong(int n){
if(n<10){
    return n*n*n;
}
return (n%10)*(n%10)*(n%10)+ armstrong(n/10);
    }
}
