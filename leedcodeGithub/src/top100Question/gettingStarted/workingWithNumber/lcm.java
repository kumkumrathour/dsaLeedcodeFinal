package top100Question.gettingStarted.workingWithNumber;

public class lcm {
    public static void main(String[] args){
        int a = 24 ;
        int b =  48;
        int l = (a>b)?a:b;
        int ans = 0;
        for(int i = l ; i<=a*b; i*=l){
            if(i%a==0 && i%b==0 ){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
