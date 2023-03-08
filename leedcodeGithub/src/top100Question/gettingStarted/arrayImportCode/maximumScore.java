package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class maximumScore {
    public static void main(String[] args){
        System.out.println("enter arr1");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr1 = new Integer[n];
        for(int i=  0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1,Collections.reverseOrder());
        System.out.println("enter for arr2");
        int m = sc.nextInt();
        Integer[] arr2 = new Integer[n];
        for(int i=  0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2,Collections.reverseOrder());
        int  p= 0;
        for(int i =0; i<m ;i++){
          p+=(arr1[i]*arr2[i]);
        }
        System.out.println(p);
    } 
}
