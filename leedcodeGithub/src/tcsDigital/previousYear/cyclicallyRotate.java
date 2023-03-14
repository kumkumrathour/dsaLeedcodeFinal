package tcsDigital.previousYear;
import java.util.*;
public class cyclicallyRotate {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k= sc.nextInt();
        for(int i = 0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int temp = 0;
        for(int i = 0 ;i<k;i++){
            System.out.println(n-k+i);
           ans[i]=arr[n-k+i];
           System.out.println(n-k);
        }
        for(int i = k ;i<n ;i++){
            System.out.println(temp++);
            ans[i]=arr[temp++];
        }
    
        for(int i = 0; i<n ; i++){
            System.out.print(ans[i]+" ");
        }

    }
}
