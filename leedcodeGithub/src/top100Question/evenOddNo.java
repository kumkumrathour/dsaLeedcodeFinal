package top100Question;
import java.util.*;
public class evenOddNo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // if(n%2==0){
    //     System.out.println("even");
    // }
    // else{
    //     System.out.println("odd");
    // }
         String res = n%2==0 ? "even" :"odd";
         System.out.println(res);
    }
}
