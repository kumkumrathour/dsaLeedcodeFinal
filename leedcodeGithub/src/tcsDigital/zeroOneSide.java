package tcsDigital;
import java.util.*;
public class zeroOneSide {
   public static void main(String[] args){
    System.out.println("enter");
    Scanner sc = new Scanner(System.in);
    int n =  sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n;i++){
        arr[i] = sc.nextInt();
    }
     int[] ans = solution(arr,n);
     for(int i = 0; i<n;i++){
        System.out.print(ans[i]+" ");
     }
   } 
   public static int[] solution(int[] arr,int n){
    int[] ans = new int[n];
    int count =0 ;
   for(int i = 0; i<n ;i++){
      if(arr[i] !=0){
        ans[count++]=arr[i];
      }
   }
   while(count<n){
    ans[count++] =0; 
   }
   return ans;
   }
}
