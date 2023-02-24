package tcsDigital;
import java.util.Scanner;
import java.util.*;
public class rockRange {
    public static void main(String[] args){
          System.out.println("enter the value");
          Scanner sc = new Scanner(System.in);
          int c =0;
          int[] arr = new int[1000];
          int s = sc.nextInt();
          int r = sc.nextInt();
          for(int i = 0; i<=s ;i++){
            arr[i] = sc.nextInt();
          }
          for(int i = 0; i<r ; i++){
            int min =  sc.nextInt();
            int max = sc.nextInt();
            for(int j = 0; j<s ;j++){
             if(arr[j]>=min && arr[j]<=max){
                c++;
             }
             System.out.println(c);
             c= 0;
            }
          }


    }
}
