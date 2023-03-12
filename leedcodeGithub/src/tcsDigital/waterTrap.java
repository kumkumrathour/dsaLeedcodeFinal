package tcsDigital;
import java.util.*;
public class waterTrap {
    public static void main(String[] args){
        System.out.println("enter");
        // Scanner sc = new Scanner(System.in);
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = arr.length;
        int max1 = 0;
        int max2 = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i = 0; i<n ;i++){
            max1=Math.max(arr[i],max1);
            left[i] =max1;
        }
        for(int i = n-1; i>=0;i--){
            max2 = Math.max(arr[i],max2);
            right[i] = max2;
        }
        int count = 0;
        int val = 0;
        for(int  i = 0; i<n ;i++){
         val= Math.min(left[i],right[i]);
         count+=val-arr[i];
        }
        System.out.println(count);
    }
}
