package dsaCourse;

public class decBinaryUsRecursion {
    public static void main(String[] args){
        decBinaryUsRecursion val = new decBinaryUsRecursion();
        int ans = val.decBin(10);
        System.out.println(ans);
    }
    public static int decBin(int n){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        return (n%2)+10*decBin(n/2);
    }
}
