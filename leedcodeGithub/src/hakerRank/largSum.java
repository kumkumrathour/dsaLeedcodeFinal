package hakerRank;
import java.util.*;
import java.util.Scanner;
public class largSum {
    public static void main(String[] args){
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // arr.add(0,2344);
        // arr.add(1,34565);
        // arr.add(2,44566);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the value");
        // int n = sc.nextInt();
        // int[] array = new int[5];
        // for(int i = 0; i<n ; i++){
        //     array[i] = sc.nextInt();
        // }
        // for(int i = 0 ; i<n ; i++){
        //     System.out.println(array[i]);
        // }
        // int[] val ={3,5};
        // int sum = 0;
        // for(int i = 0 ; i<val.length; i++){
        //    sum +=val[i];
        // }
        // System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    int sum =0 ;
        for(int arrayElement : arr){
            System.out.print(arrayElement + " ");
            sum += arrayElement;
        }
        System.out.println(sum);
    }
}
