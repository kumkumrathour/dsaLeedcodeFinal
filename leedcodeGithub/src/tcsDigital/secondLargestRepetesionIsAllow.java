package tcsDigital;
import java.util.*;
public class secondLargestRepetesionIsAllow {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int ans = solution(arr,n);
        System.out.println(ans);
    }
    public static int solution(int[] arr , int n){
        int lar = Integer.MIN_VALUE;
        int seclar =  Integer.MIN_VALUE;
        // HashMap<Integer,Integer> h = new HashMap<>();
        // for(int i :arr){
        //     if(h.containsKey(i)){
        //        int of = h.get(i);
        //        int nf= of+1;
        //        h.put(i,nf);
        //     }
        //     else{
        //         h.put(i,1);
        //     }
        // }
        for(int i :arr){
            if(i>lar){
                seclar = lar;
                lar =i;
            }
            else if(i>seclar && i!=lar){
                seclar =i;
            }
        }
        return seclar;

    }
}
