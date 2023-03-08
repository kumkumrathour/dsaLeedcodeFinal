package tcsDigital.hashmap;
import java.util.*;
public class maximumFreq {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String st = sc.next();
    HashMap<Character , Integer> ha= new HashMap<>();
    for(int i = 0; i<st.length();i++){
        char ch = st.charAt(i);
        if(ha.containsKey(ch)){
            int of = ha.get(ch);
            int nf = of+1;
            ha.put(ch,nf);
        }
        else{
            ha.put(ch,1);
        }
    }
    char mf = st.charAt(0);
    int n = 0;
    for(Character c :ha.keySet()){
        if(ha.get(c)>ha.get(mf)){
            mf = c;
            n=ha.get(c);
        }
        else if(ha.get(c)==ha.get(mf)){
            mf  = c;
            n =ha.get(c);
        }
    }
      System.out.println(mf);
      System.out.println(n);
    }
}
