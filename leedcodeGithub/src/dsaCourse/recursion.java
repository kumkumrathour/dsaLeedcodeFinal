package dsaCourse;

public class recursion {
    public static void main(String[] args){
      recursion rec = new recursion();
      var r = recursion.factorial(4);
      System.out.println(r);
    }
    public static int factorial(int n){
        if(n ==0|| n==1)
        return 1;
        System.out.println(n);
        return n*factorial(n-1);
    }
}
