package BinarySearch;
import java.util.*;
public class findKthElementInTwoSortedArray {
    static int findKth(int[] nums1,int[] nums2,int k){
        int m=nums1.length;
        int n=nums2.length;
        if(m>n)return findKth(nums2,nums1,k);
        int low=Math.max(0,k-n);
        int high=Math.min(k,m);
        while(low<=high){
            int cut1=low+(high-low)/2;
            int cut2=k-cut1;
            int l1=(cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
            int right1=(cut1==m)?Integer.MAX_VALUE:nums1[cut1];
            int l2=(cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];
            int right2=(cut2==n)?Integer.MAX_VALUE:nums2[cut2];
            if(l1<=right2 && l2<=right1){
                return Math.max(l1,l2);
            }else if(l1>right2){
                high=cut1-1;
            }else{
                low=cut1+1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr1.length; i++) {
              arr1[i]=sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        int kth=sc.nextInt();
        System.out.println(findKth(arr1,arr2,kth));
    }
}
