package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class sumOfAll {
    public static void main(String[] args){
        System.out.println("enter");
        int[] arr = {3,3,2,1,1};
        int l = arr.length-1;
        // int index = 0;
        int ans = solution(arr,l);
        System.out.println(ans);

    }
    // public static int solution(int[] arr,int index ,int l){
    //     if(index == l){
    //         return arr[index];
    //     }
    //     return arr[index]+solution(arr,index+1,l);
    // } 
    public static int solution(int[] arr ,int l){
        if(l==0){
            return arr[l];
        }
        return arr[l]+solution(arr,l-1);
    }

}
