package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class repeatingElement {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
          }
          HashMap<Integer,Integer> hm = new HashMap<>();
          for(int i : arr){
            if(hm.containsKey(i)){
                int of = hm.get(i);
                int nf = of+1;
                hm.put(i,nf);
            }else{
                hm.put(i,1);
            }
          }
          for(int j : hm.keySet()){
            int value = hm.get(j);
            if(value==1){
                System.out.print(j+" ");
            }
          }
    }
}
