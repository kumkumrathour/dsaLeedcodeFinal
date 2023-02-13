package kunalDSA.array;

public class Binar704LCrecursion {
    public static void main(String[] args){
        int[] arr = {3,5,4,1,8,9,7};
        int target = 1;
        int s = 0;
        int e = arr.length-1;
        int ans = recValue(arr, target ,s ,e);
        System.out.println(ans);
    }
    public static int recValue(int[] arr, int target , int s , int e){
        int mid =0 ;
        if(s>e){
            return -1;
        }
        mid = s +(e-s)/2;
        if(arr[mid]<target){
            return (recValue(arr,target , mid+1 ,e));
        }
        else if(arr[mid] >target){
            return (recValue(arr,target,s,mid-1));
        }
        return mid;
    }
}
