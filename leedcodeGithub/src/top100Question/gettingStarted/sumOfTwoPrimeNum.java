package top100Question.gettingStarted;
import java.util.*;
public class sumOfTwoPrimeNum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i =0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int small = Integer.MAX_VALUE;
        int seSmall = Integer.MAX_VALUE;
        for(int  i = 0; i<n ;i++){
            if(arr[i]<small){
                seSmall = small;
                small= arr[i];
            }
            else if(arr[i]<seSmall && arr[i]!=small){
                seSmall=arr[i];
            }
        }
        System.out.println(seSmall);

    }
}
