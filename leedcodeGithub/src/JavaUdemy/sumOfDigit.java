package JavaUdemy;

public class sumOfDigit {
    public static void main(String[] args){
        sumOfDigit sum = new sumOfDigit();
        int ans  = sumOfDigit.sums(38);
        System.out.println(ans);
    }
    public static int sums(int a){
        if(a==0){
            return 0;
        }
        return a%10+sums(a/10);
    }
}
