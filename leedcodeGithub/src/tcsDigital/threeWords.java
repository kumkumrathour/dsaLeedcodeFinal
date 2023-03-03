package tcsDigital;
import java.rmi.StubNotFoundException;
import java.util.*;
public class threeWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] ch = {};
        int x= a.length();
        for(int i = 0; i<x ;i++){
           if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o'|| a.charAt(i)=='u'){
                ch[i]='%';
                
           }
        }
    }
}
