package tcsDigital;
import java.util.*;
public class solveTheEquation {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(); 
        // int[] arr = new int[n+1];
        // for(int i = 1; i<=n ;i++){
        //    int val = sc.nextInt();
        //     arr[val] = i;
        // }
        
        // for(int i = 1; i<=n ;i++){
        //     int y  = arr[arr[i]];
        //     System.out.println(y);
        // }
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int p[] = new int[n+1];
            for(int i=1;i<=n;i++){
            int px=sc.nextInt();
            p[i] = px;
            }
            for(int x=1;x<=n;x++){
            int y = p[p[x]];
            System.out.println(y);
            }
    }
}
