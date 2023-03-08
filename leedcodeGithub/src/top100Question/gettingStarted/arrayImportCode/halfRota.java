package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class halfRota {
    public static void main(String[] args){
        System.out.println("enter");
        int[] arr = {43,23,42,77,4,76,54};
        // sorted array allready given 
        int n = arr.length;
        int s = 0;
        Arrays.sort(arr);
        for(int i = 0 ; i<n/2 ;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = n-1 ;i>=n/2 ; i--){
            System.out.print(arr[i]+" ");
        }
       
    }
}
