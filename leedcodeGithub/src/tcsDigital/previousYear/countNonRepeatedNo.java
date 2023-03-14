package tcsDigital.previousYear;
import java.util.*;
public class countNonRepeatedNo {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new  Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = solution(a,b);
        System.out.println(ans);
    }
    public static int solution(int a , int b){
        int count =0;
        for(int i = a; i<=b ;i++){
            boolean[] visit = new boolean[10];
            int num=i;
            
            while(num>0){
                if(visit[num%10]==true){
                    break;
                }
                visit[num%10]=true;
                num= num/10;
            }
            if(num==0){
                count++;
            }
        }
        return count;
    }
}
