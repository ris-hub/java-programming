package AdityaVerma.UnboundedKnapsack;

import java.util.Arrays;

public class unboundedknapsack {
    public static void main(String[] args) {
        int val[] = {10, 40, 50, 70};
        int wt[]  = {1, 3, 4, 5};
        int w=8;
        int n=wt.length;
        System.out.println("RECURSIVE");
        System.out.println(knapsack(wt, val, w, n));
        int [][]dp = new int[n+1][w+1];
        for (int[] row: dp)
            Arrays.fill(row, -1);
        System.out.println("MEMORIZATION");
        System.out.println(memknapsack(wt, val, dp, w, n));
        System.out.println("TOP DOWN");
        topdownknapsack(wt, val, w, n);
    }
    private static int knapsack(int[] wt, int[] val, int w, int n) {
        if(n==0 || w==0)
            return 0;

        if(wt[n-1] <= w)
            return Math.max((val[n-1] + knapsack(wt, val, w-wt[n-1], n)), knapsack(wt, val, w, n-1));

        else
            return knapsack(wt, val, w, n-1);
    }
    private static int memknapsack(int[] wt, int[] val,int [][]dp, int w, int n) {
        if(n==0 || w==0)
            return 0;

        if(dp[n][w] != -1)
            return dp[n][w];

        if(wt[n-1] <= w)
            return dp[n][w]=Math.max((val[n-1] + memknapsack(wt, val, dp, w-wt[n-1], n)), memknapsack(wt, val, dp, w, n-1));

        else
            return dp[n][w]= memknapsack(wt, val,dp,  w,n-1);
    }
    private static void topdownknapsack(int[] wt, int[] val, int w, int n) {
        int [][]dp= new int[n+1][w+1];
        for(int i=0;i<=n;i++)
            for(int j=0;j<=w;j++)
                if(i==0 || j==0)
                    dp[i][j]=0;
        for(int i=1;i<=n;i++)
            for(int j=1;j<=w;j++)
                if(wt[i-1] <= j)
                    dp[i][j] = Math.max(val[i-1]+ dp[i][j-wt[i-1]], dp[i-1][j]);
                else
                    dp[i][j]=dp[i-1][j];

        System.out.println(dp[n][w]);
    }
}
