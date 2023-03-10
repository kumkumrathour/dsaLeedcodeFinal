package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class arr2IsSubsetOfarr1 {
    public static void main(String[] args){
        System.out.println("enter arr1");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
          }
          System.out.println("enter arr2");
        int m =  sc.nextInt();
        int[] arr2 = new int[n];
        for(int i = 0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        boolean ans = solution(arr1,arr2,n,m);
        System.out.println(ans);
    }
        public static boolean solution(int[] arr1,int[] arr2,int n , int m){
            // int l = (n>m)?n:m;
            HashMap<Integer,Boolean> h = new HashMap<>();
            for(int i = 0; i<n;i++){
                h.put(arr1[i],true);
            }
            for(int val:arr2){
                if(!h.containsKey(val)){
                   return false;
                }
        }
        return true;
    }
}
