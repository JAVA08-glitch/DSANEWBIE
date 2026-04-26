package BinarySearch;
import java.util.*;

public class minimizeMaxdistanceBetweenGas {
    static double minimizeDistance(int[] arr, int k) {
        double left = 0, right = maxGap(arr);
        while ((right - left) > 1e-6) {
            double mid = (left + right) / 2.0;
            if (check(arr, k, mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right; // or left, both converge
    }

    static boolean check(int[] arr, int k, double mid) {
        int need = 0;
        for (int i = 1; i < arr.length; i++) {
            double gap = arr[i] - arr[i - 1];
            need += (int)Math.ceil(gap / mid) - 1;
            if (need > k) return false;
        }
        return need <= k;
    }

    static double maxGap(int[] arr) {
        double gap = 0;
        for (int i = 1; i < arr.length; i++) {
            gap = Math.max(gap, arr[i] - arr[i - 1]);
        }
        return gap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.printf("%.5f\n", minimizeDistance(arr, k));
    }
}
