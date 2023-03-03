package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class devisorOfNum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // for(int i = 1; i<=n ;i++){
        //     if(i%k==0){
        //         System.out.println(i);
        //     }
        // }
        int ans =0;
        int count = 0;
        for(int i = 1; i<=n ;i++){
            for(int j =1 ;j<=i ;j++){
                if(i%j==0){
                    count++;
                }
            }
        }
            if(count==k){
              ans++;
            }
        System.out.println(ans);
    }
}
