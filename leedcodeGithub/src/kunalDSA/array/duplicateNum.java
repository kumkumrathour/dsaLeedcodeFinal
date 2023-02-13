package kunalDSA.array;
import java.util.*;
public class duplicateNum {
    public static void main(String[] args){
        System.out.println("hello");
        int[] arr = {1,3,4,2,2};
        int ans = findDupl(arr);
        System.out.println(ans);
    }
    public static int findDupl(int[] arr){
        int len = arr.length;
        for(int num :arr){
            int ind = Math.abs(num);
            if(arr[ind]<0){
              return ind;
            }
        arr[ind] = -arr[ind];
        }
        return len;
    }
}
