package tcsDigital;
import java.util.*;
public class digitalchocolateQues {
    public static void main(String[] args){
       int[] arr = {1,2,3,1,1,1,3,2,2,5,5,5,5,5,5,5,7,7,9,10,10,10};
       int ans = solution(arr);
       System.out.println(ans);
    }
       public static int solution(int[] arr){
           HashMap<Integer,Integer> h = new HashMap<>();
           for(int i = 0; i<arr.length ;i++){
               if(h.containsKey(arr[i])){
                int of = h.get(arr[i]);
                int nf = of+1;
                h.put(arr[i],nf);
               }
               else{
                h.put(arr[i],1);
               }
           }
           int ans = 0;
           HashSet<Integer> a = new HashSet<>();
           for(int i = 0; i<arr.length ;i++){
            a.add(arr[i]);
           }
           for(int cho : a){
            int count =h.get(cho);
            if(count==1){
                return -1;
              }
            else{
                if(count%3==0){
                    ans+=count/3;
                }else{
                    ans+=count/3+1;
                }
            }
        }
        return ans;
    }
}
