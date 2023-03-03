package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class findQudrant {
    public static void main(String[] args){
        System.out.println("enter");
        int x = 4;
        int y = -45;
        if(x>0 && y>0){
            System.out.println("first");
        }
        else if(x<0 &&y>0){
            System.out.println("second");
        }
        else if(x<0 && y<0){
            System.out.println("third");
        }
        else if(x>0 && y<0){
            System.out.println("forth");
        }
        else if(x==0 && y==0){
            System.out.println("origin");
        }
        else if(x!=0 && y==0){
            System.out.println("x axis");
        }
        else{
            System.out.println("y axis");
        }
    }
}
