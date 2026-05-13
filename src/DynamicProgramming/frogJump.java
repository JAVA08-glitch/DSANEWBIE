package DynamicProgramming;
import java.util.*;
public class frogJump {
    static int frog(int[] heights){
        int[] dp=new int[heights.length];

        Arrays.fill(dp,-1);
        return solve(heights,dp,dp.length-1);

    }
    static int solve(int[] heights,int[] dp,int n){
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
       int left=solve(heights,dp,n-1)+Math.abs(heights[n]-heights[n-1]);
       int right=Integer.MAX_VALUE;
       if(n>1){
           right=solve(heights,dp,n-2)+Math.abs(heights[n]-heights[n-2]);
       }
       dp[n]=Math.min(left,right);
       return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] heights={2,1,3,5,4};
        System.out.println(frog(heights));
    }
}
