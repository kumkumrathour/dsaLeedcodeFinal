package kunalDSA.linkList;
import java.util.*;
public class reverseArray {
    public static void main(String[] args){
     int[] arr = {2,34,45,6,56,78,6};
     swap(arr,0,arr.length-1);
     System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr , int s ,int e){
       while(s<e){
        int temp = arr[s];
          arr[s] = arr[e];
          arr[e] = temp;
          s++;
          e--;
       }
    }
}
