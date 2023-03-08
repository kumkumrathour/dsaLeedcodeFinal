package tcsDigital.hashmap;
import java.util.*;

public class understandingHM {
    public static void main(String[] args){
        HashMap<String,Integer> h = new HashMap<>();
        h.put("kumkum",3);
        h.put("mohit",2);
        h.put("vavvva",4);
        h.put("atul",1);
         h.put("kumkum",7);
         h.put("priya",5);
         System.out.println(h);
         System.out.println(h.get("vavvva"));
        //  h.put("apoorv",0);
         System.out.println(h.get("apoorv"));
         System.out.println(h.containsKey("kumkum"));
         System.out.println(h.containsKey("apoorv"));
         Set<String> s = h.keySet();
         System.out.println(s);

        // for(int i =0 ; i<h.length ;i++){
        //     char ch = h.get(i);
        //     if(h.containsKey(h.get(i))){

        //     }
        //     else{

        //     }

        // }
            }
    }

