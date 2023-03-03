package tcsDigital;
import java.util.*;
public class rotatingArray {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        int rot = q%n;
        for(int  i =  0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<=q ;i++){
            int x = sc.nextInt();
            if(x-rot>=0){
               System.out.println(arr[x-rot]);
            }
            else{
                System.out.println(arr[x-rot+arr.length]);
            }
        }
    }
}
