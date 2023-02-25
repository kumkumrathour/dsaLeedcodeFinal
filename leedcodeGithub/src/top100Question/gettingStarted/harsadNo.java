package top100Question.gettingStarted;
import java.util.*;
public class harsadNo {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = getVal(n);
        if(n%ans==0){
            System.out.println("yes harshed");
        }
        else{
            System.out.println("not harshed");
        }
        
    }
    public static int getVal(int n){
        int rem = 0;
        int sum =0 ;
        while(n!=0){
           rem = n%10;
            sum +=rem;
            n = n/10;
        }
        return sum;
    }
}
