package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class secondSmall {
    public static void main(String[] args){
        System.out.println("enter");
        int[] arr = {3,4,37,44,1,3,40};
        int small= Integer.MAX_VALUE;
        int thesmall = Integer.MAX_VALUE;
        for(int  i = 0; i<arr.length ;i++){
          if(arr[i]<small){
            small= arr[i];
          }
        }
        for(int i = 0; i<arr.length ;i++){
            if(arr[i]<thesmall && arr[i]!=small){
                thesmall= arr[i];
                System.out.println(thesmall);
            }
        }

    //     int largest = Integer.MIN_VALUE;
    //     int seclargest= Integer.MIN_VALUE;
    //     for(int i = 0; i<arr.length ;i++){
    //         if(arr[i]>largest){
    //             seclargest=largest;
    //             largest=arr[i];
    //         }
    //         else if(seclargest<arr[i]){
    //             seclargest = arr[i];
    //         }
    //     }
    //     System.out.println(seclargest);
    // }
    }
}
