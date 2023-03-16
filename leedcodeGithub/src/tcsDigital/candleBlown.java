package tcsDigital;
import java.util.*;
public class candleBlown {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int max =arr[0];
        int i = 1;
        while(i<n){
            if(arr[i]>max){
                max=arr[i];
                i++;
            }
            i++;
        }
        int count =0;
        for(int k :arr){
            if(k==max){
                count++;
            }
        }
        System.out.println(count);
    }
}
