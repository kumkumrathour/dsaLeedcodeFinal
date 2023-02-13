package leedcode.questOfTheDay;

public class firstAndPast34 {
    public static void main(String[] args){
        System.out.println("hello");
        int[] arr = {5,7,7,8,8,10};
        int tar = 8;
        System.out.println(search(arr ,tar));
    }
    public static int[] search(int[] arr , int tar){
        int[] res = new int[2];
        if(arr.length==0){
            res[0]=-1;
            res[1]=-1;
        }
        for(int i = 0; i<arr.length ;i++){
            if(arr[i] ==tar){
                System.out.println(arr[i]+""+i);
            }
            else{
                res[0] =-1;
                res[1]=-1;
            }
        }
        return res;
    }
}
