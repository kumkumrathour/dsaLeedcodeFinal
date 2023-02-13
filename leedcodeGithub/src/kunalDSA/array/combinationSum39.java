package kunalDSA.array;
// package kunalDSA;
// import java.util.*;
// public class combinationSum39 {
//     public static void main(String[] args){
//         int[] arres ={2,3,6,7};
//         int target = 7;
//         List<List<Integer>> ans = new ArrayList<>();
//         findCom(0,arres,target,ans,new ArrayList<>());
//         return ans;
//     }
//     public void findCom(int ind,int[] arr, int target, List<List<Integer>> ans,List<Integer> pick){
//         if(ind ==arr.length){
//             if(target ==0){
//                 ans.add(new ArrayList<>(pick));
//             }
//             return;
//         }
//         if(arr[ind]<=target){
//             pick.add(arr[ind]);
//             findCom(ind, arr, target-arr[ind], ans, pick);
//             pick.remove(pick.size()-1);
//         }
//         findCom(ind+1, arr, target, ans, pick);
//     }
// }
