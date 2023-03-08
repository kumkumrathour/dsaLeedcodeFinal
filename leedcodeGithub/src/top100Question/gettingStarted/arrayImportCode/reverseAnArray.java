package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class reverseAnArray {
    public static void main(String[] args ){
        System.out.println("enter");
        int[] arr={3,4,1,6,5};
        // int l = arr.length-1;
        // for(int i = l ;i>=0 ;i--){
        //   System.out.print(arr[i]+" ");
        // }
        int n = arr.length;
        int temp = 0;
        int s = 0;
        int l = arr.length-1;
        while(s<=l){
            temp = arr[l];
            arr[l] = arr[s];
            arr[s] =temp;
            s++;
            l--;
        }
        for(int  i = 0 ;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
