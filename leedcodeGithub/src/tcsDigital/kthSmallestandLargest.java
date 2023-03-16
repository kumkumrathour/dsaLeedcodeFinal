package tcsDigital;
import java.util.*;
public class kthSmallestandLargest {
    public static void main(String[] args){
        System.out.println("enter");
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
        int sma= 0 ;
        int lar = 0;
        int e = arr.length;
        Arrays.sort(arr);
        for(int i = 0 ; i<arr.length ;i++){
         sma=arr[k-1];
         lar= arr[e-k];
        }
        System.out.println(sma+" "+lar);
    }
}
