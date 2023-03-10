package top100Question.gettingStarted.String;
import java.util.*;
public class allPermutation {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        List<List<String>> ans = solution(s);
        System.out.print(ans+" ");

    }
    public static List solution(String s){
        List<List<String>> res = new ArrayList<>();
        res.add(new ArrayList());
        for(char ch:s.toCharArray()){
            int n = res.size();
            for(int i = 0 ;i<n;i++){
                List<String> temp  =new ArrayList(res.get(i));
                // temp.append(ch);
                temp.add(String.valueOf(ch));
                res.add(temp);
            }
        }
        return res;
    }
}
