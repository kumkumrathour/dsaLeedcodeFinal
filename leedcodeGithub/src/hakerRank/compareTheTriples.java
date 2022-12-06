package hakerRank;

public class compareTheTriples {
    public static void main(String[] args){
        int[] a = {3,4,5,9};
        int[] b = {1,4,6,6};
        int count1 = 0;
        int count = 0 ;
        for(int i = 0 ; i<a.length ; i++){
                if(a[i]>b[i]){
                    count++;
                }
                else if(a[i]<b[i]){
                count1++;
                }
        }
          System.out.println(count + " " + count1);
    }
}
