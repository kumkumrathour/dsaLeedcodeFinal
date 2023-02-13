package kunalDSA.array;
import java.util.*;
public class recursionBubbleSort {
    public static void main(String[] args){
        System.out.println("the value is");
        int[] arr ={4,5,6,2,3,7,3};
        recursionfun(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void recursionfun(int[] arr, int n){
        if(n==1)
        return ;
        int count = 0;
        for(int i =0; i<n;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count++;
            }
        }
        recursionfun(arr, n-1);
    }

}
