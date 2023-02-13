package linkList;
import java.util.*;
public class twoDiArraColNotFix {
    public static void main(String[] args){
        System.out.println("enter the value");
        int[][] arr ={
            {3,4,5},
            {3,4,7,9,5,2},
            {6,7,8,6,5}
        };
        // print the value ;
        // for(int[] a:arr){
        //     System.out.println(Arrays.toString(a));
        // }
        
        // another method 
        for(int i =0 ; i<arr.length ;i++){
            for(int j = 0; j<arr[i].length ;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
