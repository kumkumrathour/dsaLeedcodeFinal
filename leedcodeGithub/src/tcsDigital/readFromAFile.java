package tcsDigital;
import java.util.*;
public class readFromAFile {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)==' ' || s.charAt(i)=='\t'|| s.charAt(i) =='\0'){
                continue;
            }
            else if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
                count++; 
            }
        }
        System.out.println(count);
    }
}
