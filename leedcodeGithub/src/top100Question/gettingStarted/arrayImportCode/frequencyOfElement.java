package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class frequencyOfElement {
    public static void main(String[] args){
        System.out.println("emter");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
          }
          HashMap<Integer,Integer> hs = new HashMap<>();
          for(int i :arr){
            if(hs.containsKey(i)){
                int of = hs.get(i);
                int nf = of+1;
                hs.put(i,nf);
            }
            else{
               hs.put(i,1);
            }
          }
          for(Map.Entry<Integer,Integer> i:hs.entrySet()){
            System.out.println(i.getKey() + " "+ i.getValue());

          }

}
}
