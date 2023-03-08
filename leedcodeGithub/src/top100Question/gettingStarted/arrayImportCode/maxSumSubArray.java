package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class maxSumSubArray {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = sum(arr);
        System.out.println(ans);
        // int maxSum = Integer.MIN_VALUE;
        // for(int i =0 ;  i<n ;i++){
        //     int sum = 0;
        //     for(int j = i ;j<n ; j++){
        //       sum =sum+arr[j];
        //       maxSum = Math.max(maxSum,sum);
        //     }
        // }
        // System.out.println(maxSum);

    }
    public static int sum(int[] arr){
        int orsum = 0;
        int cursum = 0;
    for(int i = 0; i<arr.length ;i++){
        if(cursum>=0){
            cursum+=arr[i];
        }
        else{
            cursum = arr[i];
        }
        if(cursum>orsum){
            orsum = cursum;
        }
    }
    return orsum;
    }
}
