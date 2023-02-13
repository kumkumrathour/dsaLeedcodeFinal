package leedcode.questOfTheDay;
import java.util.*;
public class bestTimeBuySale {
    public static void main(String[] args){
        int[] arr = {7,6,3,8,2};
      int target = 14;
      int [] ans= new int[2];
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i = 0 ; i< arr.length ; i++){
           int sum = target -arr[i];
           if(map.containsKey(sum)){
            ans[0] =map.get(sum);
            ans[1] = i;
            break;
           }
           map.put(arr[i],i);
      }
         System.out.println(arr[0] + " "+ arr[1]);
    }
}
