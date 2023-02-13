package kunalDSA.linearSearch;

public class searchingInArray {
    public static void main(String[] args){
        System.out.println("value");
        int[] arr = {3,4,5,6,7,9,32};
        int search = 34 ;
        int ans = funSearch(arr,search);
        System.out.println(ans);
    }
    public static int funSearch(int[] arr , int sea){
        int x =-1;
        for(int i :arr){
            if(i==sea){
                x = sea;
            }
            
        }
        return x;
    }
}
