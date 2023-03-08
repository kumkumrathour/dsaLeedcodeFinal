package tcsDigital.hashmap;
import java.util.*;
public class getCommonElem {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i =0; i<arr1.length ;i++){
           arr1[i] =sc.nextInt();
        }
        // Arrays.sort(arr1);
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i =0; i<arr2.length ;i++){
           arr2[i] =sc.nextInt();
        }
        // Arrays.sort(arr2);
        int[] arr = new int[100];
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0; i<n;i++){
            if(h.containsKey(arr1[i])){
                int of = h.get(arr1[i]);
                int nf = of+1;
                h.put(arr[i],nf);
            }
            else{
                h.put(arr1[i],1);
            }
        }
       for(int val :arr2){
        if(h.containsKey(val)){
            System.out.print(val + " ");
            h.remove(val);
        }
       }
    }
}
