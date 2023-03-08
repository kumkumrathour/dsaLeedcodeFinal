package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class longestPalindrom {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
          }
         System.out.println(longestPali(arr,n));
    }
    public static int longestPali(int[] arr,int n){
         Arrays.sort(arr);
         for(int i =n-1 ;i>=0 ;i--){
            if(isPalin(arr[i]))
                return arr[i];
         }
         return -1;
    }
    public static boolean isPalin(int n){
        int rem = 0;
        int temp =n;
        int val =0;
        while(temp>0){
            rem = temp%10;
            val=val*10+rem;
            temp=temp/10;
        }
        if(val==n){
            return true;
        }
        return false;
    }
}
