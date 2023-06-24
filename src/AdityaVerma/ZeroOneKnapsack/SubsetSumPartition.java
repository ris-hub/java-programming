package AdityaVerma.ZeroOneKnapsack;

import java.util.Arrays;

public class SubsetSumPartition {
    public static void main(String[] args) {
        int arr[] = {2,3, 5, 8, 11};
        int sum=11;
//        int val[] ={1, 4, 5, 7};
//        int w=7;
//        int n=wt.length;
//        System.out.println("RECURSIVE");
//        System.out.println(knapsack(wt, val, w, n));
//        int [][]dp = new int[n+1][w+1];
//        for (int[] row: dp)
//            Arrays.fill(row, -1);
//        System.out.println("MEMORIZATION");
//        System.out.println(memknapsack(wt, val, dp, w, n));
        System.out.println("TOP DOWN");
        subsetsum(arr, sum);
    }
    private static void subsetsum(int[] arr, int sum) {
        int n=arr.length;
        boolean [][]dp= new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
            for(int j=0;j<=sum;j++){
                if(i==0)
                    dp[i][j]=false;
                if(j==0)
                    dp[i][j]=true;
            }
        for(int i=1;i<=n;i++)
            for(int j=1;j<=sum;j++)
                if(arr[i-1] <= j)
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];

        System.out.println(dp[n][sum]);
    }
}
