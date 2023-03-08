package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class sortByItsFreq {
    public static void main(String[] args){
      System.out.println("enter");
      Scanner sc = new Scanner(System.in);
      int n =  sc.nextInt();
      Integer[] arr = new Integer[n];
      for(int i = 0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        
      List<Integer> li = Arrays.asList(arr);
      Map<Integer,Integer> hs = new HashMap<>();
      Map<Integer,Integer> ih= new HashMap<>();
      
      for(int i : arr){
          if(hs.containsKey(i)){
                int of = hs.get(i);
                int nf = of+1;
                hs.put(i,nf);
          }else{
              hs.put(i,1);
              ih.put(i,1);
          }
        }
        
      Collections.sort(li, (n1, n2) -> {
            int f1 = hs.get(n1);
            int f2 = hs.get(n2);
            if (f1 != f2) {
                return f2 - f1;
            } else {
                return ih.get(n1) - ih.get(n2);
            }
        });
        
      Integer[] sortedArr = li.toArray(new Integer[0]);
      
      // print the sorted array
      System.out.println("Original array: " + Arrays.toString(arr));
      System.out.println("Sorted array by frequency: " + Arrays.toString(sortedArr));
  }
}
