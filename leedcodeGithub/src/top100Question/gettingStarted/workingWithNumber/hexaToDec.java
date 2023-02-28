package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class hexaToDec {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String n =  sc.nextLine();
        int l = n.length();
        int ans = getHex(n,l);
        System.out.println(ans);
    }
    public static int getHex(String n , int l){
        int sum  = 0;
        int j  =0;
        for(int  i = l-1 ;i>=0; i--){
            if(n.charAt(i)>='0'&& n.charAt(i)<='9'){
              sum+=((n.charAt(i)-48)*(int)Math.pow(16,j));
              j++;
            }
            else if(n.charAt(i)>='A' && n.charAt(i)<='F'){
                sum+=((n.charAt(i)-55)*(int)Math.pow(16,j));
                j++;
            }
        }
        return sum;
    }
        
    
}
