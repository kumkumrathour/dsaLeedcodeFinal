package top100Question.gettingStarted.advanceArray;
import java.util.*;
public class sort012 {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;  i<n ; i++){
             arr[i] = sc.nextInt();
        }
        // int[] ans = solution(arr);
        Arrays.sort(arr);
        for(int i  = 0 ;i<n ;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // public static int[] solution(int[] arr){
    //     Arrays.sort(arr);
    //      }
    //    return arr;
   }
