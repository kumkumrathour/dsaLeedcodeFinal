package tcsDigital;
import java.util.*;
public class hcfandPrimeFac {
    public static void main(String[] args){
        System.out.println("enter");
        int[] arr= {43 , 45 , 76};
         int n = arr.length;
         System.out.println(findgcd(arr,n));
    }
    public static int findgcd(int[] arr,int n){
        int res = arr[0];
        for(int i = 0 ; i<n ; i++){
            res=solution(res,arr[i]);
        }
        return res;
    }
    public static int solution(int a , int b){
        if(b==0){
            return a;
        }
        return solution(b,a%b);
    }
}
