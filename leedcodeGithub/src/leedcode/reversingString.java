package leedcode;

public class reversingString {
    public static void main(String[] args){
        System.out.println("enter the string");
        char[] st = {'j','g','d'};
        String rev = new String(st);
        System.out.println(rev);
        int start =0;
        int end= rev.length()-1;
        while(start<end){
            char temp = st[start];
            st[start++] = st[end];
            st[end--]=temp;
        }
        System.out.println(st);
    }
}
