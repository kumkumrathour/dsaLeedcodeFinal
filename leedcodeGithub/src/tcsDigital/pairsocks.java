package tcsDigital;
import java.util.*;
public class pairsocks {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i :arr){
          if(h.containsKey(i)){
             int of = h.get(i);
             int nf = of+1;
             h.put(i,nf);
          }
          else{
            h.put(i,1);
          }
        }
        int count =  0;
        for(int j:h.keySet()){
                int val = h.get(j);
                if(val%2==0 || val%2 ==1){
                    count+= val/2;
                }   
        }
        System.out.println(count);
    }
    
}
