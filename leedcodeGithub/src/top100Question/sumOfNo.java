package top100Question;
import java.util.*;
public class sumOfNo {
    public static void main(String[] args){
      System.out.println("enter");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum= 0;
      for(int i = 0 ; i<=n ; i++){
          sum += i;
      }
      System.out.println(sum);
    }
}