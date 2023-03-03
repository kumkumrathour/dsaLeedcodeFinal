package tcsDigital;
import java.util.*;
public class cloudHoping {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int[] ans= new int[n];
        int val=100 ;
        for(int i = 0; i<n ;i++){
            ans[i]=sc.nextInt();
        }
        for(int i = 1 ;i<n ;i=k+i){
            if(ans[i-1] ==0 ){
                  val=val-1;
            }
            else if(ans[i-1]==1 ){
                 if(ans[i]==1){
                    val=val-2;
                 }
                 else{
                    val=val-1;
                 }
            }
        }
        System.out.println(val);
    }
}
