package leedcode.questOfTheDay;

public class lastWordLength {
    public static void main(String[] args){
        System.out.println("hello");
        String str = " hello World ";
        System.out.println(LengthOfLastString(str));
    }
    static int LengthOfLastString (String s){
        String str = s.trim();
        int count = 0;
        for(int i = str.length()-1 ; i>=0 ; i--){
          if(str.charAt(i) != ' '){
            count++;
          }
          else{
            break;
          }
        }
        return count;
    }
}
