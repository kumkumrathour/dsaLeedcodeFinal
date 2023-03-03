package top100Question.gettingStarted.recursion;
import java.util.*;
public class largestElemInArra {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int n = arr.length-1;;
        for(int i = 0; i<arr.length;i++){
           arr[i] = sc.nextInt();
        }
        int ans = getVal(n,arr);
          System.out.println(ans);
    }
    public static int getVal(int n , int[] arr){
        // int max = arr[0];
        // for(int i = 0;i<arr.length ;i++){
        //   if(arr[i]>max)
        //   max=arr[i];
        // }
        // return max;
        if(n==0){
            return arr[0];
        }
        // return Math.max(arr[n],getVal(n-1,arr));
        return Math.min(arr[n],getVal(n-1,arr));
    }
}
