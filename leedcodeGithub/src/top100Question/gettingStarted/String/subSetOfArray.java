package top100Question.gettingStarted.String;
import java.util.*;
public class subSetOfArray {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i  =0 ; i<n ;i++){
            arr[i] =sc.nextInt();
        }
        List<List<Integer>> ans = solution(arr);
        System.out.println(ans);
    }
    public static List solution(int[] arr){
        List<List<Integer>> re = new ArrayList<>();
        re.add(new ArrayList());
        for(int i : arr){
            int n = re.size();
            for(int j = 0; j<n ; j++){
               List<Integer> temp = new ArrayList<>(re.get(j));
               temp.add(i);
               re.add(temp);
            }
        }
        return re;
    }
}
