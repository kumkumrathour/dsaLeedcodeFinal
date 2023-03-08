package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class sortArray {
    public static void main(String[] args){
        System.out.println("enter");
        int[] arr = {32,4,2,34,87,53};
        for(int i = 0; i<arr.length ;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]= temp;
                }
            }
        }
        for(int i = 0; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
