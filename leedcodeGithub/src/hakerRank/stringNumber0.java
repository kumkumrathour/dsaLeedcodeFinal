package hakerRank;
import java.util.Scanner;
public class stringNumber0 {
    public static void main(String[] args){
        System.out.println("enter value ");
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i<=3 ; i++){
            String s = sc.next();
            int n = sc.nextInt();
            System.out.printf("%s" ,s);
            System.out.printf(" %03d\n", n);
            String m = Integer.toString(n);
            //  System.out.println();

        }
    }
}
