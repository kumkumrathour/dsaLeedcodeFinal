package codeNinja;
import java.util.Scanner;
import java.util.*;
public class complexNumber {
    int r , i;
    public complexNumber(int r1,int i1){
        r = r1;
        i = i1;
    }
    public void plus(complexNumber plu){
      r =r+plu.r;
      i=i+plu.i;
    }
    public void mult(complexNumber multi){
        int temp = r;
        r =(r*multi.r)-(i*multi.i);
        i=(temp*multi.r)+(temp*multi.i);
    }
    public void display(){
        System.out.println(r+ "+" + "i"+i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        complexNumber val1 = new complexNumber(a1,b1);
        complexNumber val2 = new complexNumber(a2,b2);
        int choice = sc.nextInt() ;
        switch(choice){
            case 1:
            val1.plus(val2);
            val1.display();
            break;
            case 2:
            val1.mult(val2);
            val1.display();
            break;
        }


    }
}
