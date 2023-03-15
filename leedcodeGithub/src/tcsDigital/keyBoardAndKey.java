package tcsDigital;
import java.util.*;
public class keyBoardAndKey {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] key = new int[n];
        for(int i = 0 ;i<n;i++){
             key[i]=sc.nextInt();
        }
        int[] mou = new int[m];
        for(int i = 0; i<m;i++){
            mou[i]=sc.nextInt();
        }
        int max =-1;
        // int l = (n>m)?n:m;
        // int[] max = new int[10];
        int count = 0;
        for(int i = 0 ; i<n;i++){
            for(int j = 0 ; j<m ;j++){
                 if(key[i]+mou[j]<=b && key[i]+mou[j]>max){
                    max=key[i]+mou[j];
                 }
            }
            System.out.println(max);
        }
    }
}
