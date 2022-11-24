package hakerRank;
import java.rmi.StubNotFoundException;
import java.util.Scanner;
public class functionSum {
    public static void main(String[] args){
        System.out.println("enter value");
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int sum = myFun(a,b);
         System.out.println(sum);
    }
    static int myFun(int a , int b){
        int value = a+b;
        return value;
    }
}
