package arrays;

public class returnsumindex {
    static int[] indexes(int[] nums,int target){
        int[] ans=new int[2];
        int[] prefixsum=new int[nums.length];
        int ansindex=ans.length-1,sum=0,idx=0;
        for(int i=0;i<prefixsum.length;i++){
            sum=sum+nums[i];

            prefixsum[i]=sum;
        }
        for(int i=0; i<nums.length;i++){
            if(prefixsum[i]==target){
               idx=i;
                ans[ansindex--]=idx;
                break;
            }
        }
        while(idx!=0){
            target-=nums[idx];
            if(target==0){
                ans[ansindex]=idx;
            }idx--;
        }
return ans;
    }
    public static void main(String[] args){
         int[] a={2,8,3,1};
         for(int value:indexes(a,13)){
             System.out.print(value+" ");
         }
    }
}
