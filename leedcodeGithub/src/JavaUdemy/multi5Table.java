package JavaUdemy;
import java.util.Scanner;
public class multi5Table {
    public static void main(String[] args){
        System.out.println("enter the number for table");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10;i++){
           int mult = n*i;
           System.out.println(n+" * "+i+" = "+mult);
        }
    }
}
