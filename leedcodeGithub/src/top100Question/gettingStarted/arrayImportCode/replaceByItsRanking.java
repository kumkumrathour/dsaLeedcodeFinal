package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class replaceByItsRanking {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=  new int[n];
        for(int i = 0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] val = Arrays.copyOf(arr,arr.length);
        Arrays.sort(val);
        int k =1;
        for(int i = 0; i<val.length ;i++){
           if(!h.containsKey(val[i])){
               h.put(val[i],k++);
           }
        }
        int[] ans = new int[val.length];
        for(int i =0; i<val.length ;i++){
            ans[i]=h.get(arr[i]);
        }
        for(int i = 0; i<val.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
