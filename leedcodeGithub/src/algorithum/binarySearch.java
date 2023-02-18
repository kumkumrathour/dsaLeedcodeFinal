package algorithum;

public class binarySearch {
    public static void main(String[] args){
             int[] arr = {1,2,3,4,5,6,7,8,9};
             int tar = 10;
             int s = 0;
             int e= arr.length;
             while(s<=e){
                int mid  = s+(e-s)/2;
                if(arr[mid]==tar){
                    System.out.println("targetfount in mid"+mid);
                    break;
                }
                else if(arr[mid]<tar){
                    mid =s+1;
                }
                else if(arr[mid]>tar){
                    mid=e-1;
                }
                else{
                    System.out.println("target not found");
                }
             }
             if(s>e){
                System.out.println("target not fount");
            
             }
    }
}
