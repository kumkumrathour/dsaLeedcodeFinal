package dsaCourse;

public class sumOfDigitRecursion {
   public static void main(String[] args){
    sumOfDigitRecursion val = new sumOfDigitRecursion();
    var ans = val.digitSum(100);
    System.out.println(ans);
   } 
   public static int digitSum(int n){
    if(n==0){
        return 0;
    }
     return n%10 + digitSum(n/10);
   }
}
