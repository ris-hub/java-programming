package AdityaVerma.ZeroOneKnapsack;

import java.util.ArrayList;

public class targetsum {
    static ArrayList<Boolean> ans = new ArrayList<>();
    public static void main(String[] args) {
        //int arr[]={5, 6, 6, 5, 7, 4, 7, 6};
        int arr[]={20, 19, 18, 20, 16};
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];
        subsetsum(arr, sum);
        System.out.println(ans);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=ans.size()/2;i++)
            if(ans.get(i)==true)
                min=Math.min(min, sum-2*i);
        System.out.println(Math.abs(min));
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

        for(int i=0;i<=sum;i++)
            ans.add(dp[n][i]);
    }
}
