package top100Question.gettingStarted.arrayImportCode;
import java.util.*;
public class sortAnArrayAnotherArray {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        for(int i = 0; i<n ; i++){
              arr1[i] = sc.nextInt();
        }
        System.out.println("enter arr2");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i<m ; i++){
              arr2[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0; i<arr1.length ;i++ ){
            if(h.containsKey(arr1[i])){
                h.put(arr1[i],h.getOrDefault(arr1[i],0)+1);
            }
            else{
                h.put(arr1[i],1);
            }
        }
        for(int i =1 ; i<arr2.length ;i++){
            int x = arr2[i];
            if(h.containsKey(x)){
                for(int j =0 ; j<h.get(x);j++){
                    System.out.print(x+" ");
                }
            }
            h.remove(x);
        }
        for(HashMap.Entry<Integer ,Integer> it :h.entrySet()){
            for(int  j =1; j<=it.getValue(); j++){
                
            }
        }
    }
}
