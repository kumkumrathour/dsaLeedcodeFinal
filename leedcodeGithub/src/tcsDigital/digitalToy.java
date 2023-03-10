package tcsDigital;
import java.util.*;
public class digitalToy {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i = 0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
          sum+=arr[i];
        }
        System.out.println(sum);
        if(sum%2==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
