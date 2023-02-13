package kunalDSA.array;
import java.util.Scanner;
public class sumOfDigitRec {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumOf(n);
        System.out.println(ans);
    }
    public static int sumOf(int n){
        if(n==0){
            return 0;
        }
        return (n%10 + sumOf(n/10));
    }
}
