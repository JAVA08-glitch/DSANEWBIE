package DynamicProgramming;
import java.util.*;
public class frogJumpKdist {
    static int findMin(int[] heights,int k){
        int[] dp=new int[heights.length];
        Arrays.fill(dp,-1);
        return solve(heights,dp,dp.length-1,k);

    }
    static int solve(int[] heights,int[] dp,int n,int k){
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
        int result=Integer.MAX_VALUE;
        for(int i=1;i<=Math.min(n,k);i++){

                  result=  Math.min(solve(heights,dp,n-i,k)+Math.abs(heights[n]-heights[n-i]),result);
        }
        dp[n]=result;
        return dp[n];
    }

    public static void main(String[] args) {
        int[] heights = {10, 20, 30, 10};
        int k = 2;

        System.out.println(findMin(heights, k));
    }
}
