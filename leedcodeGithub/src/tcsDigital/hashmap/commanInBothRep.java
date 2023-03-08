package tcsDigital.hashmap;
import java.util.*;
public class commanInBothRep {
    public static void main(String[] args){
        // System.out.println("enter");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr1 = new int[n];
        // for(int i = 0; i<arr1.length ;i++){
        //    arr1[i] = sc.nextInt();
        // }
        // int m = sc.nextInt();
        // int[] arr2 = new int[m];
        // for(int i = 0; i<arr2.length;i++){
        //    arr2[i] = sc.nextInt();
        // }
        // HashMap<Integer,Integer> h = new HashMap<>();
        // for(int i : arr1){
        //     if(h.containsKey(i)){
        //          int of = h.get(i);
        //          int nf = of+1;
        //          h.put(i,nf);
        //     }
        //     else{
        //         h.put(arr1[i],1);
        //     }
        // }
        // // for(int val : arr2){
        // //    if(h.get(arr1)==h.get(arr2)){
        // //     System.out.println(val);     
        // //    }
        // // }
        // for(int val:arr2){
        //     if(h.containsKey(val) && h.get(val)>0){
        //         System.out.print(val+" ");
        //         int of = h.get(val);
        //          int nf = of-1;
        //          h.put(val,nf);

        //     }
        // }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i : arr1){
            if(h.containsKey(i)){
                int of = h.get(i);
                int nf = of + 1;
                h.put(i, nf);
            }
            else{
                h.put(i, 1);
            }
        }
        for(int val : arr2){
            if(h.containsKey(val) && h.get(val) > 0){
                System.out.print(val + " ");
                int of = h.get(val);
                int nf = of - 1;
                h.put(val, nf);
            }
        }
    }
}
