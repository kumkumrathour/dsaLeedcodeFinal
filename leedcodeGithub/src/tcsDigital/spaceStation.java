package tcsDigital;
import java.util.*;
public class spaceStation {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i<m ;i++){
            arr[i]= sc.nextInt();
        }
        if(n==m){
            System.out.println(0);
        }
        if(m==0){
            System.out.println(0);
        }
        
    }
}
