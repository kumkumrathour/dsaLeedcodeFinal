package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class countNumEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
          }
          int cE=0;
          int cO = 0;
         for(int i =0 ; i<n ;i++){
            if(arr[i]%2==0){
            cE++;
            }
            else {
                cO++;
            }
         }
         System.out.println(cE);
         System.out.println(cO);
        
    }
}
