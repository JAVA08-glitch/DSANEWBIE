package arrays;
import java.util.*;
public class twosum {
    static int[] hashmapsum(int[] arr,int target){
        HashMap<Integer,Integer> sum=new HashMap<>();
        int[] ans={-1,-1};
        for(int i=0; i<arr.length; i++) {
            int need=target-arr[i];
            if (sum.containsKey(need)) {
            ans[0]=sum.get(need);
            ans[1]=i;

            }
            sum.put(arr[i], i);
        }return ans;
    }
    public static void main(String[] args) {
     int[] a={2,7,11,15};
     for(int value:hashmapsum(a,18)){
         System.out.print(value);
     }
    }
}
