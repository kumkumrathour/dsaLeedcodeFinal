package codeNinja;
import java.util.*;
import java.util.Scanner;
public class reverseTheArray {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int m = sc.nextInt();
    //    int k = sc.nextInt();
       int[] arr = new int[m];
       for(int i =0; i< m ; i++){
        arr[i] = sc.nextInt(); 
        // System.out.println("hw");
    }
    // System.out.println(m);
    // System.out.println(k);
    for(int i = 0 ; i<m ; i++){
           System.out.print(arr[i] + " ");
       }
  for(int i =m-1 ; i>=0 ;i--){
    System.out.print(arr[i] + " ");
  }
  int i = m+1;
  int j = m-1;
  while(i<j){
    int temp = arr[i];
    i=arr[j];
    j = temp;
    i++;
    j--;
  }
//   System.out.println(arr[i]);
    }
}
