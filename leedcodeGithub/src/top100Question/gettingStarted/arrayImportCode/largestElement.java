package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class largestElement {
    public static void main(String[] args){
        System.out.println("enter");
         Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();
         int[] arr = new int[n+1];
         for(int i = 0 ;i<n ;i++){
             arr[i] =sc.nextInt();
         }
        //  int ans = solution(arr,n);
        //  System.out.println(ans);
    }

        //  first method 

    // public static int solution(int[] arr, int n){
    //     if(arr.length<=0){
    //         return -1;
    //     }
    //     int val = Integer.MAX_VALUE;
    //     for(int i = 0; i<n;i++){
    //         if(arr[i]<val){
    //            val= arr[i];
    //         }
    //     }
    //     return val;
    // }


    //  second method 
    // public static int solution(int[] arr , int n){
    //     if(n==1){
    //         return arr[0];
    //     }
    //     return Math.min(arr[n-1],solution(arr,n-1));

    // }

    // third method 
    
}
