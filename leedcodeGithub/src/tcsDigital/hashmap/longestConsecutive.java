package tcsDigital.hashmap;
import java.util.*;

import javax.swing.SpringLayout;
public class longestConsecutive {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer,Boolean> h= new HashMap<>();
        for(int i = 0; i<arr.length ;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0 ; i<arr.length ;i++){
            h.put(arr[i],true);
        }
        for(int i :arr){
            if(h.containsKey(i-1)){
                h.put(i,false);
            }
        }
        // int ms =0;
        int m1 = 0;
        for(int j :arr){
            if(h.get(j)==true){
                int t = j;
                int t1 =1;
                while(h.containsKey(t+t1)){
                    t1++;
                }
                if(t1>m1){
                    // ms=t;
                    m1=t1;
                }
            }
        }
        System.out.println(m1);
        // for(int i = 0; i<m1;i++){
        //     System.out.println(ms+i);
        // }
    }
}
