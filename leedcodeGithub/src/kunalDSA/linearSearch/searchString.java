package kunalDSA.linearSearch;
import java.util.*;
import java.util.Arrays;

public class searchString {
    public static void main(String[] args){
        System.out.println("hello");
        String x = "kumkum";
        char t = 'z';
        System.out.println(search(x,t));
        //    System.out.println(Arrays.toString(x.toCharArray()));
    }
    public static boolean search(String str ,char t){
        for(int i =0 ;i<str.length();i++){
            if(str.charAt(i)==t){
                return true;
            }
        }
        return false;
    }
}
//  like (int i : arr)
//  in the same way the char of string can we converted into a single char at
// for(char ch : str.toCharArray())

