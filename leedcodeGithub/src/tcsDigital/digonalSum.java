package tcsDigital;
import java.util.Scanner;
import java.util.*;
public class digonalSum {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] arr = new int[n][n];
    //   Take input from the user 
    int[][] sum ;
      for(int i = 0; i<n ; i++){
           for(int  j =0 ;j<n ;j++){
            arr[i][j] = sc.nextInt();
           }
      }
    //   take output from the user
      for(int i = 0; i<n ;i++){
        for(int j =0; j<n ;j++){
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
        int sumr = 0;
        int sumc = 0;
        for(int i = 0; i<n ;i++){
            for(int j = 0; j<n ;j++){
                if(i == j){
                    sumr +=arr[i][j];
                }
                if(i+j ==n-1){
                    sumc += arr[i][j];
                }
            }
        }
        System.out.println("the answer is " + Math.abs(sumr-sumc));
    }
}
