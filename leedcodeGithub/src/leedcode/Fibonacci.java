package leedcode;

public class Fibonacci {
    public static void main (String[] args){
        int c ;
        int a = 0 ;
        int b = 1;
        for(int i = 0 ; i<=10  ; i++){
            c =a+b;
            System.out.println("" +c);
            a = b;
            b =c;
        }
    }
}
