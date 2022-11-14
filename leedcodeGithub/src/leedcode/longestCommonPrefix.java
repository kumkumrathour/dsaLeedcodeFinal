package leedcode;

public class longestCommonPrefix {
    StringBuilder s= new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArrays();
        char[] last = strs[strs.length-1].toCharArrays();
        for(int i = 0; i<first.length ; i++){
            if(first[i] != last[i])
            break;
            s.append(first[i]);
        }
        return s.toString();
}
// strs leedcode ma inbuild input deya ha 
// leedcode question no 14;
