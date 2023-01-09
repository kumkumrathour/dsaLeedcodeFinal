package Topic.string;
import java.util.Scanner;
public class string {
    public static void main(String[] args){
        System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        String a =sc.next();
        System.out.println( a);
        for(int  i  =0 ;i<=a.length();i++){
            for(int j = i+1 ;j<=a.length();j++){
                String ss =a.substring(i,j);
                System.out.println(ss);
            }
        }
    }
}
