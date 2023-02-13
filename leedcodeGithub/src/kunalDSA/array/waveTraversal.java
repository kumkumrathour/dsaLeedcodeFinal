package kunalDSA.array;
import java.util.Scanner;
import java.util.*;
public class waveTraversal {
    public static void main(String[] args){
        System.out.println("enter the value");
         Scanner sc = new Scanner(System.in);
         int r1 = sc.nextInt();
         int c1 = sc.nextInt();
         int[][] arr1 = new int[r1][c1]; 
         for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr1[0].length;j++){
                arr1[i][j]= sc.nextInt();
            }
         }
 
            for(int j = 0; j<arr1[0].length;j++){
           if(j%2==0){
            for(int i = 0; i<arr1.length;i++){
             System.out.println(arr1[i][j]);
            }
           }
           else{
            for(int i = arr1.length-1 ;i>=0 ;i--){
                System.out.println(arr1[i][j]);
            }
           }
           System.out.println(" ");
            }
         


    }
}
