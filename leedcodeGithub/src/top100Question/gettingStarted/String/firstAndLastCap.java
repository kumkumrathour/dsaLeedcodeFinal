package top100Question.gettingStarted.String;
import java.util.*;
public class firstAndLastCap {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s=  sc.next();
        char[] st =s.toCharArray(); 
        HashMap<Character,Integer> h = new HashMap<>();
        for(char ch :st){
            if(h.containsKey(ch)){
                int of = h.get(ch);
                int nf = of+1;
                h.put(ch,nf);
            }
            else{
                h.put(ch,1);
            }
        }
        System.out.println(st);
        // for(char ch:h.keySet()){
        // System.out.print(ch+" "+h.get(ch) +" ");
        // }
        for(char ch:h.keySet()){
            if(h.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
    }
}
