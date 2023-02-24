package top100Question;
import java.util.Scanner;
public class greatestOfTwo {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // if(a>b){
        //     System.out.println("a is greater");
        // }
        // else{
        //     System.out.println("b is greater");
        // }
        String ans = a>b ? "${a} is greater":"b is greater";
        System.out.println(ans);
    }
}
