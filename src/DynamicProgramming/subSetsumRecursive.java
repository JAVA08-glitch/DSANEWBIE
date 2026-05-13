package DynamicProgramming;

public class subSetsumRecursive {
    static boolean subSet(int[] num,int k){
        boolean[][] dp=new boolean[num.length+1][k+1];
        return check(dp,dp.length,k,num);
    }
    static boolean check(boolean[][] dp,int idx,int k,int[] num) {
        if(k==0)return true;
        if(idx==0)return false;
        if(dp[idx][k])return true;

        if(num[idx-1]>k){
             return dp[idx][k]=check(dp,idx-1,k,num);
        }else if(num[idx-1]<=k){
            dp[idx][k]=check(dp,idx-1,k,num);
            return  dp[idx][k]=dp[idx][idx]||check(dp,idx-1,k-num[idx-1],num);

        }return dp[idx][k];
    }
}
