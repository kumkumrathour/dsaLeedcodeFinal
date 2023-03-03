package top100Question.gettingStarted.workingWithNumber;
import java.util.*;
public class countDayOfMonth {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        int year = sc.nextInt();
         if((mon==2) && (year%4==0) || (year%100==0) || (year%400==0)){
            System.out.println("29 days");
         }
         else if(mon==2){
            System.out.println("28 days");
         }
         else if(mon==1 || mon ==3 || mon==5 || mon==7 || mon==8 || mon==10 || mon==12){
            System.out.println("31 days");
         }
         else if(mon==4 || mon==6 || mon==9|| mon==11){
            System.out.println("30 days");
         }
         else{
            System.out.println("invalid");
         }
    }
}
