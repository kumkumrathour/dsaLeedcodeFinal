package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class maximumProduct {
    public static void main(String[] args){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = solution(arr);
        System.out.println(ans);
    }
    public static int solution(int[] arr){
        int cs = 0;
        int os= 0;
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i]<=0){
                cs= 0;
            }
            else if(arr[i]>0){
                if(cs>0){
                    cs*=arr[i];
                }
                else{
                    cs=arr[i];
                }
                if(cs>os){
                    os=cs;
                }
            }
        }
        return  os;
    }
}
