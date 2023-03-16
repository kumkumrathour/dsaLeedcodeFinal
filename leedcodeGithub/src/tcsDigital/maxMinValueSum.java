package tcsDigital;
import java.util.*;
public class maxMinValueSum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min =0 ;
        int max = 0;
        int l = arr.length;
        for(int i = 0; i<l-1 ;i++){
            min+=arr[i];
        }
        for(int j = 1; j<l ;j++){
            max+=arr[j];
        }
        System.out.print(min+"  "+max);
        
    }
}
