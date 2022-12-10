package hakerRank;
import java.util.Scanner;
public class numberOfJump {
    public static void main(String[] args){
        System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        if(v1<=v2){
            System.out.println("NO");
        }
        else if((x2-x1)%(v1-v2)==0){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
