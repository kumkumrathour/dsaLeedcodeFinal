package tcsDigital;
import java.util.*;
public class hikeTheValley {
    public static void main(String[] args){
        System.out.println("enter  U or D");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        int ans = solution(n,s);
        System.out.println(ans);
    }
    public static int solution(int n , String s){
        int mount= 0 ;
        int vall = 0;
        int selev = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='U'){
               if(selev==0){
                mount++;
               }
               selev++;
            }
            else if(s.charAt(i)=='D'){
               if(selev==0){
                vall++;
               }
               selev--;
            } 
        }

        return vall;
    }
}
