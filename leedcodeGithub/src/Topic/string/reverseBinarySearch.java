package Topic.string;

public class reverseBinarySearch {
    public static void main(String[] args){
        System.out.println("hello");
        int[] arr = {9,7,6,5,4,3,2,1};
        int t = 10;
        int e = arr.length;
        int s = 0;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]==t){
                System.out.println("fount"+mid);
                break;
            }
            else if(arr[mid]<t){
              e = mid-1;
            }
            else if(arr[mid]>t){
                s= mid+1;
            }
            else{
                System.out.println("not found");
                break;
            }
        }
        if(s>e){
            System.out.println("not value found");
            
        }
    }
}
