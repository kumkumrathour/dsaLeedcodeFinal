package dsaCourse;

public class powerUsingRecursion {
    public static void main(String[] args){
        powerUsingRecursion val = new  powerUsingRecursion();
        int ans = val.powerValue( 4 ,4);
        System.out.println(ans);

    }
    public static int powerValue(int n ,int p ){
        if(p == 0){
            return 1;
        }
        if(p<0){
            return -1;
        }
        return n * powerValue(n, p-1);
    }
}
