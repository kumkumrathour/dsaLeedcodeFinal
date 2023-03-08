package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class symmetric2Darraypair {
    public static void main(String[] args){
        System.out.println("enter 2 d array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0 ; i<n ;i++){
            for(int j = 0 ; j<m ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
            //  for(int i = 0; i<n; i++){
            // for(int j= i+1; j<n ;j++){
            //     if(arr[i][0]==arr[j][1]&& arr[i][1]==arr[j][0]){
            //         System.out.print(arr[i][0]+" "+arr[i][1]);
            //     }
            // }
            HashMap<Integer,Integer> h = new HashMap<>();
            for(int i = 0; i<arr.length;i++){
                int f = arr[i][0];
                int s = arr[i][1];
                Integer val = h.get(s);
                if(val!=null && val==f){
                    System.out.println(s + " "+ f);
                 }
                else{
                    h.put(f,s);
                }
                
            }
         }
    }

