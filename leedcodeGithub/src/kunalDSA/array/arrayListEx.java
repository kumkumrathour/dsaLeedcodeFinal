package kunalDSA.array;
import java.util.*;
public class arrayListEx {
    public static void main(String[] args){
        System.out.println("enter");
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    for(int i = 0; i< 8 ; i++){
        list.add(sc.nextInt());
    }
    for(int i = 0 ; i< 8 ; i++){
       System.out.println(list.get(i));
    }
    // System.out.println(list);
    }
}
