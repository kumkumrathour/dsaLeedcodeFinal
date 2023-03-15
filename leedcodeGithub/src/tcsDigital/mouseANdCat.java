package tcsDigital;
import java.util.*;
public class mouseANdCat {
    public static void main(String[] args){
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 0 ; i<q ;i++){
        catAndMouse();
        }
    }
        public static void catAndMouse(){
            Scanner sc = new Scanner(System.in);
            int[] ans = new int[3];
            for(int i = 0 ;i<ans.length ;i++){
                  ans[i] = sc.nextInt();
        }
        if(Math.abs(ans[2]-ans[0])>Math.abs(ans[2]-ans[1])){
                   System.out.println("B");
        }
        else if(Math.abs(ans[2]-ans[0])<Math.abs(ans[2]-ans[1])){
                System.out.println("a");
        }
        else if(Math.abs(ans[2]-ans[1])==Math.abs(ans[2]-ans[0])){
            System.out.println("m");
        }

    }
}
