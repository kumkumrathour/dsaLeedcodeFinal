package Topic.string;
import java.util.Scanner;
public class pallindrom {
    public static boolean isPallindrom(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if(ch1 != ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;

    }
    public static void solution(String ss){
        for(int i = 0 ; i<=ss.length()-1; i++){
            for(int j = i+1;j<=ss.length()-1;j++){
                String s =ss.substring(i,j);
                if(isPallindrom(s)==true ){
                    System.out.println(s);
                }
        }
    }
}
    public static void main(String[] args){
        System.out.println("eter a string");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
         solution(a);
    }
}

