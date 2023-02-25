package top100Question;
import java.util.*;
public class abundantNo {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int ans = getRem(n);
         if(ans>n){
            System.out.println("yes");
         }
         else{
            System.out.println("no");
         }
    }
    public static int getRem(int n){
        int count = 1;
        int sum = 0;
        while(n>count){
            if(n%count==0){
                sum+=count;
                count++;
            }
            else{
                count++;
            }
        }
        return sum;
    }
}
