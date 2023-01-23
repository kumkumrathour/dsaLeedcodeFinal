package codeNinja;
import java.util.*;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class rorateArray {
    public static void main(String[] args){
        System.out.println("hello");
         Scanner sc = new Scanner(System.in);
         int n  = sc.nextInt();
         int[] arr = new int[n];
         for(int i =0 ; i<n ;i++){
            arr[i] = sc.nextInt();
         } 
         for(int i =0 ; i<n ;i++){
            System.out.print(arr[i] + " ");
         }
         int k = sc.nextInt();
         reverse(arr,0,n-k);
         reverse(arr,n+1-k,n);
         reverse(arr,0,n);
        for(int i =0 ; i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
 public static  void  reverse(int[] arr , int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
    x++;
    y--;
}
    
}
