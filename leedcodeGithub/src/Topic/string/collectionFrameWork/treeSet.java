package Topic.string.collectionFrameWork;
import java.util.*;
public class treeSet {
    public static void main(String[]  args){
        System.out.println("hello");
        // add int in decending order
         TreeSet t = new TreeSet<>( new MyComparator());
         t.add(1);
         t.add(2);
         t.add(3);
         t.add(5);
         t.add(10);
         t.add(7);
         System.out.println(t);
    }
}
class MyComparator implements Comparator{
    public int compare(Object obj1 , Object obj2){
             Integer l1 = (Integer)obj1;
             Integer l2 = (Integer)obj2;
             if(l1<l2){
                return 1;
             }
             else if(l1>l2){
                return -1;
             }
             else{
                return 0;
             }
    }
}
