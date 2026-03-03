package arrays;
import java.util.*;
public class longestSubArraySum {
    static int subArraySum(int[] arr,int k){
        int i=0,j=0,maxLength=0,sum=0;
        while(j<arr.length){
         sum+=arr[j];
            if(sum==k){
                int length=j-i+1;
                maxLength=Math.max(length,maxLength);

            }
            while(sum>k){
                sum-=arr[i];
                i++;
            }j++;
        }return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        while(no-->0) {
            int size=sc.nextInt();
            int[] arr = new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            System.out.print(subArraySum(arr,target));
        }
    }
}
