package kunalDSA.array;

public class lengthOfString {
    public static void main(String[] args){
        String str = "Kumkum";
        int n = str.length();
        int ans  = count(str);
        System.out.println(ans);
    }
    public static int count(String str){
     if(str.equals(""))
     return 0;
     else{
        return count(str.substring(1))+1;
     }
    }
}
