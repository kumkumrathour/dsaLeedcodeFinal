package dsaCourse;

public class gcdUsingRecursion {
    public static void main(String[] args){
        gcdUsingRecursion val = new gcdUsingRecursion();
        int ans = val.gcd(12,8);
        System.out.println(ans);
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        if(b<0){
            return -1;
        }
        return  gcd(b,a%b);
    }
}
