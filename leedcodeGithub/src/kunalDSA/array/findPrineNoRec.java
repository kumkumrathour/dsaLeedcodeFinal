package kunalDSA.array;
import java.util.Scanner;

import javax.xml.transform.Source;
public class findPrineNoRec {
    public static void main(String[] args){
        System.out.println(" ente rthe number");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         boolean ans = primeNo(n ,2);
         System.out.println(ans);
    }
    public static boolean primeNo(int n , int i){
        if(n==0 || n ==1){
            return false;
        }
        else if(n%2==0){
            return false;
        }
        if(n==i){
            return true; 
        }
        return primeNo(n,i+1);

    }

}
