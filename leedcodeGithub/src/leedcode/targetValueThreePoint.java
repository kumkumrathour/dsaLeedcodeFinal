package leedcode;
import java.util.Arrays;
public class targetValueThreePoint {
    public static void main(String[] args){
        System.out.println("the value are");
        int[] arr ={7,-6,3,8,-1,8,-11};
        int target = 0;
        solution(arr,target,arr.length);
    }
    public static void solution(int[] arr ,int target, int n){
        Arrays.sort(arr);
        for(int i =0 ; i<n;i++){
            while(i ==0 || arr[i]!=arr[i-1]){
                int j = i+1;
                int k =n-1;
                int tar= target-arr[i];
                while(j<k){
                    if(arr[i]+arr[k] ==tar){
                        System.out.println(arr[i]+ ""+arr[j] + "" + arr[k]);
                        while(j<k && arr[j]==arr[j+1]) j++;
                        while(j<k && arr[k]==arr[k-1]) k--;
                  
                    } 
                    else if(arr[j] +arr[k]< target){
                        j++;
                    }
                    else{
                        k--;
                    }
                }
            }
        }
    }
}
