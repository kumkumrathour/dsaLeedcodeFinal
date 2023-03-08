package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class mimimumProduct {
    public static void main(String[] args){
        System.out.println("enter arr 1");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
          }
          Arrays.sort(arr1);
        System.out.println("enter arr2");
        int m =  sc.nextInt();
        Integer[] arr2 = new Integer[m];
        for(int i = 0; i<m; i++){
            arr2[i] = sc.nextInt();
          }
         Arrays.sort(arr2,Collections.reverseOrder());
         int  p =0;
         int l = (m>=n)?m:n;
         for(int i= 0; i<l ; i++){
            p+=(arr1[i]*arr2[i]);
         }
         System.out.println(p);
    }
}
