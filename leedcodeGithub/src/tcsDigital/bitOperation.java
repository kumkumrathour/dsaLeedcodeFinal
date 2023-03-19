package tcsDigital;
import java.util.*;
public class bitOperation {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner  sc = new Scanner(System.in);
        int n= sc.nextInt();
        binaryVal(n);
    }
    public static void binaryVal(int n){
        int[] ans = new int[1000];
        int count = 0;
        while(n>0){
            ans[count++] = n%2;
            n =n/2;
        }
        for(int j = count-1; j>=0 ;j--){
           System.out.print(ans[j]+" ");
        }

    }
}
