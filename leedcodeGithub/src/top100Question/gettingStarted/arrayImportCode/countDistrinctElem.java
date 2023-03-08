package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class countDistrinctElem {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
          }
          HashSet h = new HashSet();
          for(int i :arr){
              h.add(i);
          }
        //   System.out.println(h.size());
        //   System.out.println(h);
        Iterator it = h.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
