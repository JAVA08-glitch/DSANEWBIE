package recursion;
import java.util.*;
public class powerSet {
    static List<List<Integer>> powerSet(int[] nums) {
     List<List<Integer>> pile=new ArrayList<>();
     List<Integer> ls=new ArrayList<>();
      subSet(pile,nums,0,ls);
      return pile;
    }
   static void subSet(List<List<Integer>> pile,int[] nums,int idx,List<Integer> ls){
        if(idx==nums.length){
            pile.add(new ArrayList<>(ls));
            return;
        }else {
            ls.add(nums[idx]);
            subSet(pile, nums, idx + 1, ls);
            ls.remove(ls.size()-1);
            subSet(pile, nums, idx + 1, ls);
        }

   }
    public static void main(String[] args) {
          int[] nums={1,2,3,4};
        System.out.println(powerSet(nums));
    }
}
