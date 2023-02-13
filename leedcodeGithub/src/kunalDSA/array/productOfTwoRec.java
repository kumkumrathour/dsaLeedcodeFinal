package kunalDSA.array;
import java.util.Scanner;
public class productOfTwoRec {
    public static void main(String[] args){
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = productValue(a,b);
        System.out.println(ans);
    }
    public static int  productValue(int a, int b){
        if(b==1){
            return a;
        }
        return   (a + productValue(a, b-1));
    }
}
