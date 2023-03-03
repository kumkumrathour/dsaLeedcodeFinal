package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class occurrenceOfNum {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rem = 0;
        int count= 0;
        while(n>0){
            rem = n%10;
            if(rem==k){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
