package tcsDigital;
import java.util.*;
public class countTheDivisor {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];
        int count = 0;
        int i = 0;
        while(n>0){
             ans[i] = sc.nextInt();
             int original = ans[i];
             int temp= ans[i];
             while(temp>0){
             int rem = temp%10;
             if(rem==0){
                temp=temp/10;
             }
             else if(original%rem==0){
                count++;
                temp=temp/10;
              }
              else{
                 temp=temp/10;
                }
              }
            System.out.println(count);
            count= 0;
            i++;
            n--;
        }
    }
}
