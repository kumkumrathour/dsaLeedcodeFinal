package linkList;
import java.util.Scanner;
import java.util.*;
public class defineTwoDeArray {
    public static void main(String[]  args){
        System.out.println("enter the no");
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // int[][] arr2D = {
        //     {2,3,4},
        //     {3,4,5,6,8},
        //     {5,6,7}
        // };
        for(int i =0 ; i<arr.length;i++){
            for(int j =0 ; j<arr[i].length; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        // for(int[] a : arr){
        //     System.out.println(Arrays.toString(a));
        // }
        for(int a = 0; a<arr.length; a++){
         System.out.println(Arrays.toString(arr[a]));
        }
    }
}
