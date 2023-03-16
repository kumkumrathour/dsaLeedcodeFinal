package tcsDigital;
import java.util.*;
public class valley {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ch = new char[n];
        for(int i = 0; i<n ;i++){
            ch[i] =sc.next().charAt(0);
        }
        int mount= 0 ;
        int val = 0;
        int step = 0;
        for(int i = 0; i<n ;i++){
            if(ch[i]=='U'){
                if(step ==0){
                    mount++;
                }
                step++;
            }
            else if(ch[i]=='D'){
                if(step==0){
                    val++;
                }
                step--;
            }
        }
        System.out.println(val);
        
    }
}
