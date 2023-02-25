package top100Question.gettingStarted;
import java.util.*;
public class aramStrongRange {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int i = low ;i<=high ;i++){
            int digit = 0;
            int temp = i;
            int sum = 0;
            int len = getlen(i);
            while(temp != 0){
                digit =temp%10;
                sum = sum+(int)Math.pow(digit,len);
                temp/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
        
        }
        public static int getlen(int l){
            int count = 0;
            while(l!=0){
              count++;
               l= l/10;
            }
            return count;
        }
}
