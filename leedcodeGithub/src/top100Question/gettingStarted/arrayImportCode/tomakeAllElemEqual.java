package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class tomakeAllElemEqual {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(solution(arr)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static boolean solution(int[] arr){
        for(int i = 0; i<arr.length ; i++){
            while(arr[i]%2==0){
                  arr[i]/=2;
            }
            while(arr[i]%3==0){
                arr[i]/=3;
            }
        }
        for(int i = 1; i<arr.length; i++){
            if(arr[i]!=arr[0]){
                return false;
            }
        }
        return true;
    }
}
