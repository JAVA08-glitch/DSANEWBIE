package recursion;
import java.util.*;

public class subsetSum {
    static List<Integer> sum(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        subset(ls, nums, 0, 0);
        Collections.sort(ls);
        return ls;
    }

    static void subset(List<Integer> ls, int[] nums, int sum, int idx) {
        if (idx == nums.length) {
            ls.add(sum);
            return;
        }

        subset(ls, nums, sum + nums[idx], idx + 1);

        subset(ls, nums, sum, idx + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<Integer> result = sum(nums);

        System.out.println("Subset sums:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
