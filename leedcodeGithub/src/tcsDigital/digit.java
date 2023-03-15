package tcsDigital;
import java.util.*;
public class digit {
    public static void main(String[] args){
    System.out.println("enter");
    Scanner sc=  new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("enter array");
    int[] arr = new int[n];
    for(int i = 0; i<n ;i++){
        arr[i]= sc.nextInt();
    }
    HashMap<Integer,Integer> h = new HashMap<>();
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
   for(int i: arr){
    if(h.get(i)==1){
        System.out.println(i);
    }
   }
    }
}
