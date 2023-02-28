package Topic.string.collectionFrameWork;
import java.util.*;
public class Linklist {
    public static void main(String[] args){
        System.out.println("enter");
        LinkedList l = new LinkedList();  
        l.add("a");
        // l.set(2,"b");
        l.add(null);
        l.addFirst("e");
        l.addLast("s");
        l.remove(1);
        System.out.println(l);

    }
}
