package leedcode.leetcodeContest;
import java.util.*;
public class sumOfEleDigit {
    public static void main(String[] args){
      int[] nums = {1,15,6,3};
      int sum =0;
      int sumd =0;
      for(int i =0 ; i<nums.length ;i++){
        sum+=nums[i];
        while(nums[i]>0){
            int rem = nums[i]%10;
             sumd += rem;
            System.out.println(rem);
            nums[i]=nums[i]/10;
        }
      }
     System.out.println(sumd);
     System.out.println(sum);
     System.out.println(Math.abs(sumd-sum));
    }
}
