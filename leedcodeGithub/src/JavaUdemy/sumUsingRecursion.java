package JavaUdemy;
import java.util.Scanner;
public class sumUsingRecursion {
    public static void main(String[] args){
        System.out.println("hello");
     sumUsingRecursion rev = new sumUsingRecursion();
        
        int ans = sumUsingRecursion.sum(5);
        System.out.println(ans);
        // int m = sc.nextInt();

    }
    public static int sum(int a){
        if(a==0 || a==1){
            return 1;
        }
        System.out.println(a);
        return a+sum(a-1);
    }
}

