package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class sortingElem {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0;i<n ;i++){
         System.out.print(arr[i] + " ");
        }
    }
}
