package leedcode.leetcodeContest;

public class countDistintctNo {
    public static void main(String[] args){
        System.out.println("enter no ");
        int n = 13;
        int ans = disCount(n);
        System.out.println(ans);

    }
    public static int disCount(int n){
        if(n==1){
            return 1;
        }
        else{
            return (n-1);
        }
    }
}
