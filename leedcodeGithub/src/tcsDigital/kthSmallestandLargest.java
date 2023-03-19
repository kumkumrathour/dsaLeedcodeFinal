package tcsDigital;
import java.util.*;
public class kthSmallestandLargest {
    public static void main(String[] args){
        System.out.println("enter");
        int[] arr = {5,5,5,4,4,3,3,3,1,1,0,0};
        int k = 3;
        int sma = 0;
        int lar = 0;
        int e = arr.length;
        Arrays.sort(arr);
        for(int i = 0 ; i<arr.length ;i++){
         sma= arr[k-1];
         lar= arr[e-k];
        }
        System.out.println(sma+" "+lar);
    }
}
