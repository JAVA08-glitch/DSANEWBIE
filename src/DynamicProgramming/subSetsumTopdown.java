package DynamicProgramming;

import java.util.*;
public class ZeroOneKnapsack{
    static boolean subset(int[] arr,int k){
        boolean[][] dp=new boolean[arr.length][k+1];
        for(int i=0;i<arr.length;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j]=dp[i-1][j];
                if(j>=arr[i-1]){
                    dp[i][j]=dp[i][j]||dp[i-1][j-arr[i-1]];
                }
            }
        }return dp[arr.length-1][k];
    }

    public static void main(String[] args) {
        int[] a={2,3,7,8,12};
        int k=11;
        System.out.println(subset(a,k));
    }
}

