package recursionByKunal;

public class introOfRecursion {
    public static void main(String[] args){
        System.out.println(" hello world");
        //  leetcode 2259 question number (remove digit from number)
        String no = "1231";
        int dig = 1;

        for(int i =0 ; i<no.length() ; i++){
            if(no.charAt(i) ==dig){
                System.out.println(no.charAt(i));
            }
        }
    }
}
