//package arrays;
//
//import java.util.*;
//
//public class ThreeSum {
//    static Set<List<Integer>> triplets(int[] arr,int target){
//       Set<List<Integer>> ans=new HashSet<>();
//       for(int i=0; i<arr.length;i++){
//           int temptarget=target-arr[i];
//           Set<Integer> holder=new HashSet<>();
//
//           for(int j=i+1; j<arr.length;j++){
//               int val=temptarget-arr[j];
//               if(holder.contains(val)){
//                   List<Integer> tripllist=new ArrayList<>();
//                   tripllist.addAll(Arrays.asList(arr[i],arr[j],val));
//                   Collections.sort(tripllist);
//               }
//           }
//       }
//    }
//    public static void main(String[] args) {
//
//    }
//}
