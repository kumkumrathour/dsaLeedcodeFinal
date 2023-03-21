package tcsDigital;
import java.util.*;
public class ragestration {
    public static void main(String[] args){
      System.out.println("enter");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] arr = new int[n][n];
      for(int i = 0; i<n;i++){
        for(int  j =0 ;j<n;j++){
            arr[i][j]= sc.nextInt();
        }
      }
      for(int i = 0; i<n;i++){
        for(int  j =0 ;j<n;j++){
          if(i==0 || i==n-1 ||j==0||j==n-1){
            System.out.print(arr[i][j]);
          }
          else if(arr[i][j]>arr[i][j-1]&&arr[i][j]>arr[i][j+1]){
            System.out.print("X");
          }
          else{
            System.out.print(arr[i][j]);
          }
        }
        System.out.println();
      }
    }
}
