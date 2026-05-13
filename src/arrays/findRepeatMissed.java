package arrays;
import java.util.*;
public class findRepeatMissed {
    static int cycle(int[] num){
        int i=0,n=num.length,repeat=0,miss=0;
        while(i<n){
            if(!check(num,i)){
                if(!check(num,num[i]-1)) {
                    int swap = num[num[i] - 1];
                    num[num[i] - 1] = num[i];
                    num[i] = swap;
                }

            }i++;
        }for(int j=0;j<num.length;j++){
            if(num[j]!=j+1)repeat=num[j]+j;
        }
        return repeat;
    }
    static boolean check(int[] nums,int i){
        if(nums[i]==i+1)return true;
        return false;
    }
    public static void main(String[] args) {
     int[] a= {1, 2, 3, 6, 7, 5, 7};
        System.out.println(cycle(a));
    }
}
