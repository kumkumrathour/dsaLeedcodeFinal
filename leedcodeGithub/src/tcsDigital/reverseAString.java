package tcsDigital;
import java.util.*;
public class reverseAString {
    public static void main(String[] args){
        System.out.println("Enter String ");
        Scanner sc = new Scanner(System.in);
        StringBuilder st = new StringBuilder();
        String s = sc.nextLine();
        String[] word = s.split("\\s");
        for(int i = word.length-1 ; i>=0;i--){
           st.append(word[i]).append(" ");
        }
        System.out.println(st);

        
    }
}
