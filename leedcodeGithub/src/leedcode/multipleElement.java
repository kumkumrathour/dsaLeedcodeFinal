package leedcode;
import java.util.*;
public class multipleElement {
    public static void main(String[] args){
        int [] nums = {7,8,7,7,4,2};
        int res = majorityElement(nums);
        System.out.println(res);
    }

    static int majorityElement(int[] nums) {
        Map<Integer,Integer> myMajor = new HashMap<Integer,Integer>();
        int total= 0;
        for(int key : nums){
            if( !myMajor.containsKey(key))
            myMajor.put(key,1);
            else
            myMajor.put(key,myMajor.get(key)+1);
            if(myMajor.get(key)>nums.length/2){
                total=key;
                break;
            }
        }
        return total;
    }
}
