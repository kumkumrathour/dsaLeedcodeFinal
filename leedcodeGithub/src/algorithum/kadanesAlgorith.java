package algorithum;
import java.util.*;
public class kadanesAlgorith {
    public static void main(String[] args){
        System.out.println("enter a value");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char st =a.charAt(0);
        if(st>='a'&&st<='z'){
          System.out.println("the the value is 0");
        }
        if(st>='A'&&st<='Z'){
         System.out.println("the the value is 1");
        }
        else{
          System.out.println("the the value is -1");
        }
    }
}
