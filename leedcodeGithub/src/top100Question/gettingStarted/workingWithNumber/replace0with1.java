package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class replace0with1 {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String s = Integer.toString(n);
        int len= s.length()-1;
        String str ="";
        for(int i = 0; i<=len;i++){
            if(s.charAt(i)==0){
                str=str+1;
            }
            else{
                str=str+s.charAt(i);
            }

        }
        System.out.println(str);
    }
}
