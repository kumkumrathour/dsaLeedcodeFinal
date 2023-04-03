import java.util.*;
public class sort123Inarray {
    public static void main(String[] args){
        System.out.println("Hello");
        int[] arr ={1,2,0,1,2,0,1};
        int e= 0 ;
        int h = arr.length-1;
        int m = 0;
        int mid =1;
       while(m<=h){
        if(arr[m]<mid){
            int temp = arr[e];
            arr[e] = arr[m];
            arr[m] = temp ;
            e++;
            m++;
        }
        else if(arr[m]>mid){
            int temp = arr[m];
            arr[m] = arr[h];
            arr[h]=temp;
            h--;
        }
        else{
         m++;
        }
       }
        for(int i = 0; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
