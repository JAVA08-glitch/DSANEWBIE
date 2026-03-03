package arrays;
import java.util.*;
public class longestconsecutivesubsequence {
    static int longest(int[] arr) {
        Arrays.sort(arr);
        int count = 1, maxcount = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                count++;
                if (count > maxcount) {
                    maxcount = count;
                } else if (arr[i] - arr[i - 1] > 1) {

                    count = 0;
                }
            }
        }
        return maxcount;
    }

    public static void main(String[] args) {
        int[] a = {56, 1, 4, 69, 2, 3};
        int num = longest(a);
        if (num == 1) {
            System.out.println(0);
        } else if (num > 0) {
            System.out.println(num);
        }
    }
}
