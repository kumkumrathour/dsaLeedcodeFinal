package leedcode;
import java.util.Scanner;
public class threeSum {
    public static void main(String[] args){
       System.out.println("the value i");
       int target = 0;
       int count =0;
    //    Scanner sc= new Scanner(System.in);
         int[] nums = {7,-6,3,8,-1,8,-1};
         for(int i = 0; i<nums.length;i++){
            for(int j =i+1; j<nums.length;j++){
                for(int k = j+1 ; k<nums.length ; k++){
                    if(nums[i]+nums[j]+nums[k]== target){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
